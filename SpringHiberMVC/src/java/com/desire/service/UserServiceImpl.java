/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desire.service;

import com.desire.dao.UserDao;
import com.desire.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDao userDao;
    
    @Override
    @Transactional
    public void addUser(Users user) {
        
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(Users user) {

        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public List<Users> listUsers() {
        
        return userDao.listUsers();
    }

    @Override
    @Transactional
    public Users getUserById(Integer userId) {
        
        return userDao.getUserById(userId);
    }

    @Override
    @Transactional
    public void removeUser(Integer userId) {
        
        userDao.removeUser(userId);
    }
}
