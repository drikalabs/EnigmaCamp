package com.enigma.controllers;

import com.enigma.entities.User;
import com.enigma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> GetAllUser(){
        return userService.GetAllUser();
    }
    @GetMapping("/user/{idUser}")
    public User getUserByID(@PathVariable String idUser){
        return userService.GetUserById(idUser);
    }
    @PostMapping("/user")
    public User SaveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @DeleteMapping("/deleteuser/{idUser}")
    public void DeleteUserByid(@PathVariable String idUser){
        userService.DeleteUserByID(idUser);
    }
}
