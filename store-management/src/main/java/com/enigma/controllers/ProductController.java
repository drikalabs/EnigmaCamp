package com.enigma.controllers;

import com.enigma.entities.Product;
import com.enigma.service.ProductService;
import com.enigma.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public List<Product> products(Product product){
        return productService.getAllProducs(product);
    }
    @GetMapping("/product/{idProduct}")
    public Product getProduct(@PathVariable String idProduct){
        return productService.getProductById(idProduct);
    }
    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }
}
