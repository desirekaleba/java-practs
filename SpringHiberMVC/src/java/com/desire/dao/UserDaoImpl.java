
package com.desire.dao;

import com.desire.model.Users;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    
    
    @Override
    public void addUser(Users user) {
        
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(Users user) {
       
    }

    @Override
    public List<Users> listUsers() {
        
        return sessionFactory.getCurrentSession().createQuery("from users").list();
    }

    @Override
    public Users getUserById(Integer userId) {
     return new Users();
    }

    @Override
    public void removeUser(Integer userId) {
        
    }
    
}
