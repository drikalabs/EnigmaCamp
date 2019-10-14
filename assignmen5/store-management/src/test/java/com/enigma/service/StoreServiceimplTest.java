package com.enigma.service;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepositories;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceimplTest {
    @Autowired
    StoreRepositories storeRepositories;
    @Autowired
    StoreService storeService;

    @Before
    public void setUp() {
        storeRepositories.deleteAll();
    }

    @Test
    public void Store_save_Expected_created() {
        Store newStore= new Store("Toko Ngkoh","Jakarta","Jual apa aja","098765433456");
        newStore =storeService.save(newStore);
        Store realResult =storeRepositories.findById(newStore.getId()).get();
        assertEquals(newStore,realResult);
    }

    @Test
    public void Should_True_getAll_Size_2() {
        Store newStore1= new Store("Toko Ngkoh","Jakarta","Jual apa aja","098765433456");
        Store newStore2= new Store("Toko Abah","Jakarta","Jual  aja apa","098754387656");
        storeService.save(newStore1);
        storeService.save(newStore2);
        assertEquals(2,storeRepositories.findAll().size());
    }
    @Test
    public void Should_True_when_getOneById(){
        Store newStore= new Store("Toko Ngkoh","Jakarta","Jual apa aja","098765433456");
        newStore =storeService.save(newStore);
        Store result =storeRepositories.findById(newStore.getId()).get();
        assertEquals(newStore,result);
    }
}