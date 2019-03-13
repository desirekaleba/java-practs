package com.desire.dao;

import com.desire.model.Users;
import java.util.List;

public interface UserDao {
    
    public void addUser(Users user);

    public void updateUser(Users user);

    public List<Users> listUsers();

    public Users getUserById(Integer userId);

    public void removeUser(Integer userId);
}
