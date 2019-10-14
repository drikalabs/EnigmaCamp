package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "purchased")
public class Purchased {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idPurchase;

    /*private String idProduct;
    private  Integer quantity;*/
    @OneToMany(mappedBy = "purchased",cascade = CascadeType.PERSIST)
    private List<PurcaseDetail>purcaseDetails = new ArrayList<>();

    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Transient
    private String userid;

    /*public Purchased(List<ItemPurcase> itemPurcases) {
        this.itemPurcases = itemPurcases;
    }*/



    public Purchased() {
    }

    public String getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(String idPurchase) {
        this.idPurchase = idPurchase;
    }
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<PurcaseDetail> getPurcaseDetails() {
        return purcaseDetails;
    }

    public void setPurcaseDetails(List<PurcaseDetail> purcaseDetails) {
        this.purcaseDetails = purcaseDetails;
    }
    public BigDecimal sumAlltotalPrice(BigDecimal price){
        return this.totalPrice= price.add(this.totalPrice);
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    /*public List<ItemPurcase> getItemPurcases() {
        return itemPurcases;
    }

    public void setItemPurcases(List<ItemPurcase> itemPurcases) {
        this.itemPurcases = itemPurcases;
    }*/


    /*public String getIdProduct() {
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
*/

}
