package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "purchase_detail")
public class PurcaseDetail {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idPd;
    @ManyToOne
    @JoinColumn(name = "id_purchase")
    private Purchased purchased;
    private String idProduct;
    private Integer quantity;
    private BigDecimal subtotal;

    public PurcaseDetail(String idProduct, Integer quantity) {
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public PurcaseDetail() {
    }

    public String getIdPd() {
        return idPd;
    }

    public void setIdPd(String idPd) {
        this.idPd = idPd;
    }

    public Purchased getPurchased() {
        return purchased;
    }

    public void setPurchased(Purchased purchased) {
        this.purchased = purchased;
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

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    public void setSubTotalPrice(BigDecimal basePrice) {
        this.subtotal = basePrice.multiply(new BigDecimal(this.quantity));
    }
}
