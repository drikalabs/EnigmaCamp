package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.PurcaseDetail;
import com.enigma.entities.Purchased;
import com.enigma.entities.User;
import com.enigma.repositories.PurchaseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchaseServiseimpl implements PurchaseService {
    @Autowired
    PurchaseRepositories purchaseRepositories;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

;

    @Override
    public Purchased getPurchasedById(String id) {
        if (!purchaseRepositories.findById(id).isPresent()) {
            return new Purchased();
        }
        return purchaseRepositories.findById(id).get();
    }

    @Override
    public List<Purchased> GetPurschaseFromUser(String idUser) {
        User user=userService.GetUserById(idUser);
        return user.getPurchaseds();
    }


    @Override
    public Purchased savePurchaseFromUser(String idUser, Purchased purchased) {
        /*User user = userService.GetUserById(idUser);
        purchased.setUser(user);
        productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setSubTotalPrice(productService.getProductPriceById(purchased.getIdProduct()));
        return purchaseRepositories.save(purchased);*/

        /*productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.getProductPriceById(purchased.getIdProduct()));*/
        return purchaseRepositories.save(purchased);
    }

    @Override
    public List<Purchased> getAllPurchases() {
        return purchaseRepositories.findAll();
    }

    @Override
    public Purchased purchasing(Purchased purchased) {
       /* productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setSubTotalPrice(productService.getProductPriceById(purchased.getIdProduct()));*/
        return purchaseRepositories.save(purchased);
    }

    @Override
    public Purchased savepurchase(Purchased purchased) {
        User user=userService.GetUserById(purchased.getUserid());
        purchased.setUser(user);
        for (PurcaseDetail items:purchased.getPurcaseDetails()) {
            sumTotalAndSubtotal(purchased, items);
        }
        return purchaseRepositories.save(purchased);
    }

    private void sumTotalAndSubtotal(Purchased purchased, PurcaseDetail items) {
        Product product =productService.getProductById(items.getAcuanproductId());
        items.setIdProduct(product);
        productService.deduct(items.getIdProduct().getIdProduct(), items.getQuantity());
        items.setSubTotalPrice(productService.getProductPriceById(items.getIdProduct().getIdProduct()));
        items.setPurchased(purchased);
        BigDecimal total=productService.getProductPriceById(items.getIdProduct().getIdProduct());
        purchased.setTotalPrice(total);
    }
}
