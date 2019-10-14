package com.enigma.service;

import com.enigma.entities.User;
import com.enigma.repositories.UserRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceimplTest {
    @Autowired
    UserService userService;
    @Autowired
    UserRepositories userRepositories;
    @Before
    public void Setup(){
        userRepositories.deleteAll();
    }

    @Test
    public void Should_be_Created_When_saveUser_DB() {
        User user= new User("Adrika","andrika.bogal@gmail.com","trenggalek","MALE");
        user=userService.saveUser(user);
        User actual=userRepositories.findById(user.getIdUser()).get();
        assertEquals(user,actual);
    }

    @Test
    public void getUserById() {
        User user= new User("Adrika","andrika.bogal@gmail.com","trenggalek","MALE");
        user=userService.saveUser(user);
        User actual=userService.GetUserById(user.getIdUser());
        assertEquals(user,actual);
    }

    @Test
    public void getAllUser() {
        User user1= new User("Adrika","andrika.bogal@gmail.com","trenggalek","MALE");
        User user2= new User("dedy","dedyl@gmail.com","Lampung","MALE");
        User user3= new User("Fatiri","fatiri@gmail.com","bogor","MALE");
        user1 =userRepositories.save(user1);
        user2 =userRepositories.save(user2);
        user3 =userRepositories.save(user3);
        List<User>users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        assertEquals(users,userService.GetAllUser());
    }

    @Test
    public void deleteUserByID() {
    }
}