package com.enigma.entity;

import javax.persistence.*;

@Entity
@Table(name = "mst_outlet")
public class Outlet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idOutlet;
    private String outletCode;
    private String outletName;

    public Outlet(String outletCode, String outletName) {
        this.outletCode = outletCode;
        this.outletName = outletName;
    }

    public Integer getIdOutlet() {
        return idOutlet;
    }

    public void setIdOutlet(Integer idOutlet) {
        this.idOutlet = idOutlet;
    }

    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }
}
