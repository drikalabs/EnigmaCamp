package com.enigma.controllers;

import com.enigma.entities.Product;
import com.enigma.service.ProductService;
import com.enigma.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public List<Product> products(){
        return productService.getAllProducs();
    }
    @GetMapping("/product/{idProduct}")
    public Product getProduct(@PathVariable String idProduct){
        return productService.getProductById(idProduct);
    }
    @PostMapping("/product")
    public void saveProductwithIdStore(@RequestBody Product product){
        productService.saveProduct(product);
    }
    @PostMapping("/productstore")
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product,product.getdataidStore());
    }
    @GetMapping("/products/{keyword}")
    public List<Product> products(@PathVariable String keyword){
        return productService.getProducsByName(keyword);
    }
    @GetMapping("store/{idStore}/producs")
    public List<Product> getProducsByStoreId(@PathVariable Integer idStore){
        return productService.getProducsbyStoreId(idStore);
    }
    @PostMapping("store/{idStore}/product")
    public Product SaveProductBYStoreId(@PathVariable Integer idStore,@RequestBody Product product){
        return productService.saveProductByStore(idStore,product);
    }
    @GetMapping("/products")
    public Page<Product>getAllProduct(@RequestParam Integer size,@RequestParam Integer page){
        Pageable pageable= PageRequest.of(page,size);
        return productService.GetAll(pageable);
    }
}
