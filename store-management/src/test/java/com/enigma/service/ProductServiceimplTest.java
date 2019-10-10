package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.repositories.ProductRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceimplTest {
    @Autowired
    ProductRepositories productRepositories;
    @Autowired
    ProductService productService;

    @Before
    public void SetUp(){
        productRepositories.deleteAll();
    }
    @Test
    public void Should_Created_when_saveProduct() {
        Product product = new Product("sabun mandi",3,new BigDecimal(1000.00));
        productService.saveProduct(product);
        assertEquals(1,productRepositories.findAll().size());
    }

    @Test
    public void getProductById() {
        Product product = new Product("sabun mandi",3,new BigDecimal(1000.00));
        Product product1= productService.saveProduct(product);
        Product result = productRepositories.findById(product1.getIdProduct()).get();
        assertEquals(product1,result);

    }

    @Test
    public void getAllProducs_should_size_3() {
        Product product1 = new Product("sabun mandi",3,new BigDecimal(1000.00));
        Product product2 = new Product("sabun cuci",3,new BigDecimal(1000.00));
        Product product3 = new Product("sabun muka",3,new BigDecimal(1000.00));
        productService.saveProduct(product1);
        productService.saveProduct(product2);
        productService.saveProduct(product3);
        assertEquals(3,productRepositories.findAll().size());
    }

    @Test
    public void Should_result_as_Expexcted_quantity() {
        Integer dibeli =1;
        Integer expexted =2;
        Product product = new Product("sabun mandi",3,new BigDecimal(1000.00));
        Product product1 =productService.saveProduct(product);
        Integer deduct = product1.getQuantity()-dibeli;
        product1.setQuantity(deduct);
        assertEquals(expexted,product1.getQuantity());

    }

    @Test
    public void price_should_be_same_with_Expexted() {
        Product product = new Product("sabun mandi",3,new BigDecimal(1000.00));
        Product result=productService.saveProduct(product);
        BigDecimal expected= new BigDecimal(1000.00);
        assertEquals(expected,result.getPrice());
    }

    @Test
    public void getProducsByName() {
    }
}