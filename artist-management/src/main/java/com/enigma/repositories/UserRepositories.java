package com.enigma.repositories;

import com.enigma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User,String> {
    User findUserByUsername(String username);
}
