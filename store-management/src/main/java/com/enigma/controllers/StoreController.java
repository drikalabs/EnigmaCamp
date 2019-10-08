package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    StoreService storeService;
    //requesr satuan
    @GetMapping("/store/{id}")
    public Store getStore(@PathVariable Integer id){
       return  storeService.getStoreById(id);
    }
    @PostMapping("/store")
    public void saveStore(@RequestBody Store store){
        storeService.save(store);
    }
    @GetMapping("/store")
       public List<Store>stores(Store store){
        return  storeService.getAll(store);
    }
}
