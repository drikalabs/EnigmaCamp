package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceimpl implements StoreService {
    @Autowired
    StoreRepositories storeRepositories;

    @Override
    public Store save(Store store) {
        for (Product product:store.getProducts()) {
            product.setStore(store);
        }
        return storeRepositories.save(store);
    }

    @Override
    public Store getStoreById(Integer id) {
        if (!storeRepositories.findById(id).isPresent()){
            return new Store();
        }
        return storeRepositories.findById(id).get();
    }

    @Override
    public List<Store> getAll(Store store) {
        return storeRepositories.findAll();
    }

    @Override
    public Page<Store> SearchByKeyword(Pageable pageable, Example<Store> keyword) {
       /* return storeRepositories.findAllByAddressContainsOrDescriptionContainsOrPhoneNumberContainsOrStoreNameContains(keyword,keyword,keyword,keyword,pageable);*/
        return storeRepositories.findAll(keyword,pageable);
    }
}
