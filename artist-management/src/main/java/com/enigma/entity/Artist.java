package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "mst_artist")
public class Artist {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idArtist;
    private String artistName;
    private String bornPlace;
    private String gender;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date debuteDate;

    public Artist() {
    }

    public Artist(String artistName, String bornPlace, String gender) {
        this.artistName = artistName;
        this.bornPlace = bornPlace;
        this.gender = gender;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDebuteDate() {
        return debuteDate;
    }

    public void setDebuteDate(Date debuteDate) {
        this.debuteDate = debuteDate;
    }
}
