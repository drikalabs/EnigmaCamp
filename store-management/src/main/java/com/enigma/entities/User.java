package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_user")
public class User {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idUser;

    private String userName;
    private String email;
    private String address;
    private String gender;

    /*@OneToMany(mappedBy = "idUser",cascade = CascadeType.PERSIST)
    private List<Purchased> purchaseds= new ArrayList<>();*/

    public User(String userName, String email, String address, String gender) {
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public User() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   /* public List<Purchased> getPurchaseds() {
        return purchaseds;
    }

    public void setPurchaseds(List<Purchased> purchaseds) {
        this.purchaseds = purchaseds;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(address, user.address) &&
                Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, userName, email, address, gender);
    }
}
