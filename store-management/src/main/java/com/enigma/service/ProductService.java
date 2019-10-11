package com.enigma.service;

import com.enigma.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public Product getProductById(String id);
    public List<Product> getAllProducs(Product product);
    public void deduct(String idProduct, Integer quantity);
    public BigDecimal getProductPriceById(String idProduct);
    public List<Product> getProducsByName(String keyword);
    public List<Product>getProducsbyStoreId(Integer idStore);
    public Product saveProductByStore(Integer idStore,Product product);
}
