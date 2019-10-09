package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    ProductRepositories productRepositories;

    @Override
    public void saveProduct(Product product) {
    productRepositories.save(product);
    }

    @Override
    public Product getProductById(String id) {
        if (!productRepositories.findById(id).isPresent()){
            return new Product();
        }
    return productRepositories.findById(id).get();
    }

    @Override
    public List<Product> getAllProducs(Product product) {
        return productRepositories.findAll();
    }

    @Override
    public void deduct(String idProduct, Integer quantity) {
        Product product=getProductById(idProduct);
        product.deductQuantity(quantity);
        saveProduct(product);

    }

    @Override
    public BigDecimal getProductPriceById(String idProduct) {
        return getProductById(idProduct).getPrice();
    }
}
