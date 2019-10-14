package com.enigma.service;

import com.enigma.entities.Store;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface StoreService {
    public Store save(Store store);
    public Store getStoreById(Integer id);
    public List<Store> getAll(Store store);
    /*public List<Store> searchByName(String name);
    public void delete(Integer id);*/
    public Page<Store>SearchByKeyword(Pageable pageable, Example<Store> keyword);

}
