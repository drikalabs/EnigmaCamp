package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "purchased")
public class Purchased {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idPurchase;
    private String idProduct;
    private Integer quantity ;
    private BigDecimal totalPrice;

    public String getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(String idPurchase) {
        this.idPurchase = idPurchase;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setPurchasePrice(BigDecimal productPrice){
        this.totalPrice = productPrice.multiply(new BigDecimal(this.quantity));
    }
}
