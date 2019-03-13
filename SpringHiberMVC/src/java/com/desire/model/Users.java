package com.desire.model;

import org.hibernate.annotations.Entity;




@Entity
public class Users  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private String firstname;
     private String lastname;
     private String email;
     private String address;
     private String phone;

    public Users() {
    }

    public Users(String username, String password, String firstname, String lastname, String email, String address, String phone) {
       this.username = username;
       this.password = password;
       this.firstname = firstname;
       this.lastname = lastname;
       this.email = email;
       this.address = address;
       this.phone = phone;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }




}


