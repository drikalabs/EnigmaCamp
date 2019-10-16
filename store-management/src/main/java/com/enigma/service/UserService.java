package com.enigma.service;

import com.enigma.entities.User;
import com.enigma.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public User GetUserById(String idUser);
    public List<User> GetAllUser();
    public void DeleteUserByID(String idUser);
    public Page<User>findBuUserSpecification(User user, Pageable pageable);
}
