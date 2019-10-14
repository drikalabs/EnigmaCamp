package com.enigma.controllers;

import com.enigma.entities.Purchased;
import com.enigma.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping("/purchase")
    public List<Purchased> purchasedList(){
        return purchaseService.getAllPurchases();
    }
    @GetMapping("/purchase/{idPurchase}")
    public Purchased getPurchase(@PathVariable String idPurchase){
        return purchaseService.getPurchasedById(idPurchase);
    }
    @PostMapping("/purchase")
    public void savePurchase(@RequestBody Purchased purchased){
        purchaseService.purchasing(purchased);
    }
    @PostMapping("user/{idUser}/purcahse")
    public Purchased purchased(@PathVariable String idUser,@RequestBody Purchased purchased){
        return purchaseService.savePurchaseFromUser(idUser,purchased);
    }
    @GetMapping("user/{idUser}/purcahse")
    public List<Purchased> purchaseds(@PathVariable String idUser){
        return purchaseService.GetPurschaseFromUser(idUser);
    }
}
