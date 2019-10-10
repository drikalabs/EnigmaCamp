package com.enigma.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mst_store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "seq_mst_store",allocationSize = 1)
    private Integer id;

    private String storeName;
    private String address;
    private String description;
    private String phoneNumber;

    public Store(String storeName, String address, String description, String phoneNumber) {
        this.storeName = storeName;
        this.address = address;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public Store() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(address, store.address) &&
                Objects.equals(description, store.description) &&
                Objects.equals(phoneNumber, store.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeName, address, description, phoneNumber);
    }
}
