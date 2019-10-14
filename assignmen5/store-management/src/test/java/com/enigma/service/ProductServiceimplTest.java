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
import java.util.ArrayList;
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
        Product product = new Product("sabun mandi",3,new BigDecimal(1000));
        product=productService.saveProduct(product);
        assertEquals(product,productRepositories.findById(product.getIdProduct()).get());
    }

    @Test
    public void Should_Have_Same_Product_When_getById() {
        Product product = new Product("sabun mandi",3,new BigDecimal(1000));
        Product product1= productService.saveProduct(product);
        Product result = productRepositories.findById(product1.getIdProduct()).get();
        assertEquals(product1,result);
    }

    @Test
    public void getAllProducs_should_as_Expected(){
        Product product1 = new Product("sabun mandi",3,new BigDecimal(1000));
        Product product2 = new Product("sabun cuci",3,new BigDecimal(1000));
        Product product3 = new Product("sabun muka",3,new BigDecimal(1000));
        product1=productService.saveProduct(product1);
        product2=productService.saveProduct(product2);
        product3=productService.saveProduct(product3);
        List<Product>expectad =new ArrayList<>();
        expectad.add(product1);
        expectad.add(product2);
        expectad.add(product3);
        assertEquals(expectad,productRepositories.findAll());
    }

    @Test
    public void Should_Deduct_result_as_Expexcted_quantity() {
        Integer dibeli =1;
        Integer expected =2;
        Product product = new Product("sabun mandi",3,new BigDecimal(1000));
        product =productRepositories.save(product);
        productService.deduct(product.getIdProduct(),dibeli);
        assertEquals(expected,productRepositories.findById(product.getIdProduct()).get().getQuantity());
    }

    @Test
    public void price_should_be_same_as_Expected() {
        Product product = new Product("sabun mandi",3,new BigDecimal(1000));
        Product result=productService.saveProduct(product);
        assertEquals(product.getPrice(),result.getPrice());
    }

    @Test
    public void getProducsByNameShould_return_ListProducs_as_expected() {
        String keyword="bun";
        Product product1 = new Product("sabun mandi",3,new BigDecimal(1000));
        Product product2 = new Product("sabun cuci",3,new BigDecimal(1000));
        Product product3 = new Product("sabun muka",3,new BigDecimal(1000));
        product1=productService.saveProduct(product1);
        product2=productService.saveProduct(product2);
        product3=productService.saveProduct(product3);
        List<Product>expected=new ArrayList<>();
        expected.add(product1);
        expected.add(product2);
        expected.add(product3);
        List<Product> products=productRepositories.findAllByNameContains(keyword);
        assertEquals(expected,products);
    }
}