package com.saurav.userManagementSystem.configration;

import com.saurav.userManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    //local Date
    public LocalDate getDate(){
        LocalDate myObj = LocalDate.now(); // Create a date object
        return myObj;
    }
    public LocalTime getTime(){
        LocalTime myObj = LocalTime.now();
        return myObj;
    }
    LocalDate date = getDate();
    LocalTime time = getTime();
    @Bean
   public List<User> getIntialUserList() {
        User Intialuser= new User("1","Saurav","1998-02-24","sauravnhk@gmail.com","919487482730",date,time);
        List<User>UserList = new ArrayList<>();
        UserList.add(Intialuser);
        return UserList;
    }
}
