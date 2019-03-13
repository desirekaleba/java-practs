/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desire.service;

import java.util.*;
import com.desire.model.Users;
/**
 *
 * @author desire
 */
public interface UserService {
    
    public void addUser(Users user);

    public void updateUser(Users user);

    public List<Users> listUsers();

    public Users getUserById(Integer userId);

    public void removeUser(Integer userId);
}
