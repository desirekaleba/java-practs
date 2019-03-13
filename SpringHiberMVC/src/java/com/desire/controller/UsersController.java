/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desire.controller;

import com.desire.model.Users;
import com.desire.service.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UsersController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping("/")
    public String listUsers(Map<String, Object> map){
        
        map.put("user", new Users());
        map.put("userlist", userService.listUsers());
        return "index";
    }
    
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") Users user, BindingResult bindingResult){
        
        if(user.getId() == null){
            userService.addUser(user);
        }
        return null;
    
    }
}
