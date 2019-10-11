package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.PurchaseRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseServiseimplTest {
    @Autowired
    PurchaseRepositories purchaseRepositories;
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    ProductService productService;

    @Before
    public void setUp() throws Exception {
        purchaseRepositories.deleteAll();
    }

    @Test
    public void purchasing_Should_Be_CreatedIn_DB() {
        Integer purchase=3;
        Product product= new Product("sabun mandi",10,new BigDecimal(10000));
        Product target=productService.saveProduct(product);
        Purchased purchased =new Purchased(target.getIdProduct(),purchase);
        Purchased expected=purchaseService.purchasing(purchased);
        Purchased result = purchaseRepositories.findById(expected.getIdPurchase()).get();
        assertEquals(expected,result);
    }

    @Test
    public void getAllPurchasesShouldSize2() {
        Integer purchase1=3;
        Integer purchase2=2;
        Product product= new Product("sabun mandi",10,new BigDecimal(10000));
        Product target=productService.saveProduct(product);
        Purchased purchased1 =new Purchased(target.getIdProduct(),purchase1);
        Purchased purchased2 =new Purchased(target.getIdProduct(),purchase2);
        purchaseService.purchasing(purchased1);
        purchaseService.purchasing(purchased2);
        assertEquals(2,purchaseRepositories.findAll().size());
    }

    @Test
    public void getPurchasedById() {
    }
}