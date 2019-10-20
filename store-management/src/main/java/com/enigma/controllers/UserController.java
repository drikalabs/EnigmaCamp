package com.enigma.controllers;

import com.enigma.entities.User;
import com.enigma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:9090", maxAge = 3600)
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
    @GetMapping("/userSearch")
    public Page<User>findUserBySpecification(@RequestParam Integer size,@RequestParam Integer page,@RequestBody User user){
        Pageable pageable= PageRequest.of(size,page);
        return userService.findBuUserSpecification(user,pageable);
    }
}
