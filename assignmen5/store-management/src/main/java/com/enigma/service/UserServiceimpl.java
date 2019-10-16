package com.enigma.service;

import com.enigma.entities.User;
import com.enigma.repositories.UserRepositories;
import com.enigma.specification.UserSpacification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepositories userRepositories;
    @Override
    public User saveUser(User user) {
        return userRepositories.save(user);
    }

    @Override
    public User GetUserById(String idUser) {
        return userRepositories.findById(idUser).get();
    }

    @Override
    public List<User> GetAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public void DeleteUserByID(String idUser) {
        userRepositories.deleteById(idUser);
    }

    @Override
    public Page<User> findBuUserSpecification(User user, Pageable pageable) {
        return userRepositories.findAll(UserSpacification.findByCriterias(user),pageable);
    }
}
