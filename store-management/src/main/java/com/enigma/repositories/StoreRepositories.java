package com.enigma.repositories;

import com.enigma.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepositories extends JpaRepository<Store, Integer> {
}
