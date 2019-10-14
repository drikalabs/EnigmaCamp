package com.enigma.repositories;

import com.enigma.entities.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepositories extends JpaRepository<Store, Integer> {
//    @Query(nativeQuery = true,value = "select * from  mst_store where address like '%?%' or store_name like '%?%' or phone_number like '%?%' or description like '%?%'")
//    Page<Store>findByKeyword(String keyword,Pageable pageable);
    Page<Store>findAllByAddressContainsOrDescriptionContainsOrPhoneNumberContainsOrStoreNameContains(String address, String description, String phoneNumber, String storeName, Pageable pageable);
}
