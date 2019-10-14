package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.entities.User;
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
    @Autowired
    UserService userService;

    @Override
    public Purchased getPurchasedById(String id) {
        if (!purchaseRepositories.findById(id).isPresent()){
            return new Purchased();
        }
        return purchaseRepositories.findById(id).get();
    }

    @Override
    public List<Purchased> GetPurschaseFromUser(String idUser) {
        return null;
    }

    @Override
    public Purchased savePurchaseFromUser(String idUser, Purchased purchased) {
        return null;
    }

/*    @Override
    public Purchased savePurchaseFromUser(String idUser, Purchased purchased) {
        User user=userService.GetUserById(idUser);
        Product product =productService.g
        productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.getProductPriceById(purchased.getIdProduct()));
        return purchaseRepositories.save(purchased);
        return null;
    }*/

    @Override
    public List<Purchased> getAllPurchases() {
        return purchaseRepositories.findAll();
    }

    @Override
    public Purchased purchasing(Purchased purchased) {
        productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.getProductPriceById(purchased.getIdProduct()));
        return purchaseRepositories.save(purchased);
    }
}
