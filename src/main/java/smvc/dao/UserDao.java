package smvc.dao;

import org.springframework.transaction.annotation.Transactional;
import smvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional(readOnly = false)
    public int saveUser(User user){
        int id = (Integer) this.hibernateTemplate.save(user);
        return id;
    }
}
