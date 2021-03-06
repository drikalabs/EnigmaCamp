package com.enigma.repositories;

import com.enigma.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User,String> , JpaSpecificationExecutor<User> {
}
