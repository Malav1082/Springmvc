package smvc.controller;

import smvc.model.User;
import smvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Contact Here");
        m.addAttribute("Description","Contact Page");
        System.out.println("adding common data to model");
    }

    @RequestMapping("/contact")
    public String showForm(Model m) {
        System.out.println("Creating form");
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
        int createdUser = this.userService.createUser(user);
        model.addAttribute("msg","User created with id" +createdUser);
        return "success";
    }
}

//
//@Controller
//public class ContactController {
//
//    @RequestMapping("/contact")
//    public String showForm(){
//        return "contact";
//    }
//
//    @RequestMapping(path="/processform",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email") String userEmail,
//                             @RequestParam("name") String userName,
//                             @RequestParam("password") String userPassword,
//                             Model model) {
//        System.out.println("user Email :" +userEmail);
//        System.out.println("user Name :" +userName);
//        System.out.println("user Password :" +userPassword);
//
//        User user = new User();
//        user.setEmail(userEmail);
//        user.setName(userName);
//        user.setPassword(userPassword);
//
//        System.out.println();
//
//        //process
////        model.addAttribute("name",userName);
////        model.addAttribute("email",userEmail);
////        model.addAttribute("password",userPassword);
//
//        model.addAttribute("user",user);
//        return "success";
//    }
//}
