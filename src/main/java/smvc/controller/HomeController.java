package smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping(path = "/home" , method = RequestMethod.GET)
    public String home(Model model){
        System.out.println("hello this is home url");
        model.addAttribute("name","Malav Shah");
        model.addAttribute("id",13);

        List<String> friends = new ArrayList<String>();
        friends.add("Dhruv");
        friends.add("Bhaumik");
        friends.add("Devansh");

        model.addAttribute("f",friends);

        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("hello this is about url");
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        System.out.println("hello this is services url");
        return "smvc/service";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("hello this is help page");
        // creating model and view object
        ModelAndView modelAndView = new ModelAndView();
        //setting the data
        modelAndView.addObject("name","Malav");
        modelAndView.addObject("id",73);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);

        //marks
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        modelAndView.addObject("marks",list);

        //setting view name
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
