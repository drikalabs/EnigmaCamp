package com.enigma.service;

import com.enigma.entity.User;
import com.enigma.exception.UserNotFoundException;
import com.enigma.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomDetailService implements UserDetailsService {
    @Autowired
    UserRepositories userRepositories;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userFound = userRepositories.findUserByUsername(username);
        if (userFound == null){
            throw new UserNotFoundException();
        }
        return new org.springframework.security.core.userdetails.User(userFound.getUsername(),userFound.getPassword(),new ArrayList<GrantedAuthority>());
    }
}
