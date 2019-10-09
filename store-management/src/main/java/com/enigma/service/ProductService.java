package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    public void saveProduct(Product product);
    public Product getProductById(String id);
    public List<Product> getAllProducs(Product product);
    public void deduct(String idProduct, Integer quantity);
    public BigDecimal getProductPriceById(String idProduct);
}
