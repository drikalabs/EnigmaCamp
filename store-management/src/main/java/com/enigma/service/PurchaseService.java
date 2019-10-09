package com.enigma.service;

import com.enigma.entities.Purchased;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PurchaseService {
    public void purchasing(Purchased purchased);
    public Purchased getPurchasedById(String id);
    public List<Purchased>getAllPurchases(Purchased purchased);
}
