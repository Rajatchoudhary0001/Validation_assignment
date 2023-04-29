package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    //get
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return userService.getUserById(userId);
    }

    @PostMapping
    public String addUser(@Valid @RequestBody User user ){
        userService.addUser(user);
        return "added succesfully";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId,@Valid @RequestBody User user ){
        userService.updateUser(userId,user);
        return "updated succesfully";
    }
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
        return "deleted succesfully";
    }

}

