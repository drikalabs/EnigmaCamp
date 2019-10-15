package com.enigma.repositories;

import com.enigma.entities.Store;
import com.enigma.specification.StoreSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepositories extends JpaRepository<Store, Integer> , JpaSpecificationExecutor<Store> {
//    @Query(nativeQuery = true,value = "select * from  mst_store where address like '%?%' or store_name like '%?%' or phone_number like '%?%' or description like '%?%'")
//    Page<Store>findByKeyword(String keyword,Pageable pageable);
    Page<Store>findAllByAddressContainsOrDescriptionContainsOrPhoneNumberContainsOrStoreNameContains(String address, String description, String phoneNumber, String storeName, Pageable pageable);
}
