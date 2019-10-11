package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import com.enigma.exception.InsufficientQuantityException;
import com.enigma.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    ProductRepositories productRepositories;
    @Autowired
    StoreService storeService;

    @Override
    public Product saveProduct(Product product) {
    return productRepositories.save(product);
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
        if (product.getQuantity()< quantity){
            throw new InsufficientQuantityException();
        }else {
            product.deductQuantity(quantity);
            saveProduct(product);
        }
    }

    @Override
    public BigDecimal getProductPriceById(String idProduct) {
        return getProductById(idProduct).getPrice();
    }

    @Override
    public List<Product> getProducsByName(String keyword) {
       return productRepositories.findAllByNameContains(keyword);
    }

    @Override
    public List<Product> getProducsbyStoreId(Integer idStore) {
        Store store =storeService.getStoreById(idStore);
        return store.getProducts();
    }

    @Override
    public Product saveProductByStore(Integer idStore, Product product) {
        Store store =storeService.getStoreById(idStore);
        product.setStore(store);
        return productRepositories.save(product);
    }
}
