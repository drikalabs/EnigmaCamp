package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.PurchaseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.PrinterException;
import java.util.List;
@Service
public class PurchaseServiseimpl implements PurchaseService {
    @Autowired
    PurchaseRepositories purchaseRepositories;
    @Autowired
    ProductService productService;

    @Override
    public Purchased getPurchasedById(String id) {
        if (!purchaseRepositories.findById(id).isPresent()){
            return new Purchased();
        }
        return purchaseRepositories.findById(id).get();
    }

    @Override
    public List<Purchased> getAllPurchases(Purchased purchased) {
        return purchaseRepositories.findAll();
    }

    @Override
    public Purchased purchasing(Purchased purchased) {
        productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.getProductPriceById(purchased.getIdProduct()));
        return purchaseRepositories.save(purchased);
    }
}
