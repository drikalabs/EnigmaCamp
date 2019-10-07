package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Artist {
    @Id
    private Integer idArtist;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date debuteDate;
    private String bornPlace;

    public Artist(Integer idArtist, String name, Date debuteDate, String from) {
        this.idArtist = idArtist;
        this.name = name;
        this.debuteDate = debuteDate;
        this.bornPlace = from;
    }

    public Artist() {
    }

    public Integer getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Integer idArtist) {
        this.idArtist = idArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDebuteDate() {
        return debuteDate;
    }

    public void setDebuteDate(Date debuteDate) {
        this.debuteDate = debuteDate;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }
}
