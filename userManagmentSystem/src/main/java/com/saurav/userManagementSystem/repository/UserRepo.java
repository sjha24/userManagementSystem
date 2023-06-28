package com.saurav.userManagementSystem.repository;

import com.saurav.userManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User>userList;

    public List<User> getAllUser() {
        return userList;
    }
}
