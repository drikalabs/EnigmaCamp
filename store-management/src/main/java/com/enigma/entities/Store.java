package com.enigma.entities;

import javax.persistence.*;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "seq_mst_store",allocationSize = 1)
    private Integer idWarung;

    private String storeName;
    private String address;
    private String description;
    private String phoneNumber;

    public Store(Integer idWarung, String storeName, String address, String description, String phoneNumber) {
        this.idWarung = idWarung;
        this.storeName = storeName;
        this.address = address;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public Store() {
    }

    public Integer getIdWarung() {
        return idWarung;
    }

    public void setIdWarung(Integer idWarung) {
        this.idWarung = idWarung;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
