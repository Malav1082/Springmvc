package smvc.service;

import smvc.dao.UserDao;
import smvc.model.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
