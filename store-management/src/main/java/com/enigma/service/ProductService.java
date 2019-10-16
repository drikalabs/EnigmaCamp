package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public Product getProductById(String id);
    public List<Product> getAllProducs();
    public void deduct(String idProduct, Integer quantity);
    public BigDecimal getProductPriceById(String idProduct);
    public List<Product> getProducsByName(String keyword);
    public List<Product>getProducsbyStoreId(Integer idStore);
    public Product saveProductByStore(Integer idStore,Product product);
    public Product saveProduct(Product product,Integer idStore);
    Page<Product>GetAll(Pageable pageable);
    public Page<Product>findUsePesification(Product product,Pageable pageable);
}
