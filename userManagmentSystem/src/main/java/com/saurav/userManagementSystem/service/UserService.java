package com.saurav.userManagementSystem.service;

import com.saurav.userManagementSystem.model.User;
import com.saurav.userManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getAllUser();
    }

    public String addUsers(List<User> users) {
        List<User>originalList = getAllUser();
        originalList.addAll(users);
        return "New Users added Successfully";
    }

    public String addUser(User user) {
        List<User>originalList = getAllUser();
        originalList.add(user);
        return "New Users added Successfully Thanks for Visiting ):";
    }

    public User getUserByID(String id) {
        List<User>userList = getAllUser();
        for(User user : userList){
            if(user.getUserID().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String updateUserByID(String id, User user) {
        List<User>userList = getAllUser();
        for(User users : userList){
            if(users.getUserID().equals(id)){
                users.setUserID(user.getUserID());
                users.setUserName(user.getUserName());
                users.setPhoneNumber(user.getPhoneNumber());
                users.setTime(user.getTime());
                users.setDate(user.getDate());
                users.setDateOfBirth(user.getDateOfBirth());
                users.setEmail(user.getEmail());
                return "Update successfully";
            }
        }
        return "Not update !!!";
    }

    public String deleteUserByItsID(String id) {
        List<User>userList = getAllUser();
        for(User user : userList){
            if(user.getUserID().equals(id)){
                userList.remove(user);
                return "User of this ID "+id+" Deleted successfully";
            }
        }
        return "User of This ID "+id+" is not found in our database";
    }
}
