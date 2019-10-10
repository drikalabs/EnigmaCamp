package com.enigma.repositories;

import com.enigma.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositories extends JpaRepository <Product ,String> {
    public List<Product> findAllByNameContains(String keyword);
}
