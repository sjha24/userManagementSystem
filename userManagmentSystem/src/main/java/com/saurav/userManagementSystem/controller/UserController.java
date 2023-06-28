package com.saurav.userManagementSystem.controller;

import com.saurav.userManagementSystem.model.User;
import com.saurav.userManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("user/{ID}")
    public User getUserByID(@PathVariable String ID){
        return userService.getUserByID(ID);
    }
    @GetMapping("users")
    public List<User>getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }
    @PostMapping("users")
    public String addUsers(@RequestBody List<User>userLists){
        return userService.addUsers(userLists);
    }
    @PutMapping(value = "user/update/{ID}")
    public String updateUserByID(@PathVariable String ID, @RequestBody User user){
        return userService.updateUserByID(ID,user);
    }
    @DeleteMapping("user/remove/{ID}")
    public String deleteUserByItsID(@PathVariable String ID){
        return userService.deleteUserByItsID(ID);
    }
}
