/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desire.model;

public class LoginUser {
    private String name;
    private String password;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
}
