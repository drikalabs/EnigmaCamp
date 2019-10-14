package com.enigma.service;

import com.enigma.entities.Purchased;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    public Purchased purchasing(Purchased purchased);
    public Purchased getPurchasedById(String id);
    public List<Purchased>getAllPurchases();
    public List<Purchased>GetPurschaseFromUser(String idUser);
    public Purchased savePurchaseFromUser(String idUser,Purchased purchased);
    public Purchased savepurchase(Purchased purchased);
}
