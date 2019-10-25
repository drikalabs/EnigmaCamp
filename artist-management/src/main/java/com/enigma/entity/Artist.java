package com.enigma.entity;

import java.util.Date;

public class Artist {
    private String idArtist;
    private String artistName;
    private String bornPlace;
    private String gender;
    private Date debuteDate;

    public Artist() {
    }

    public Artist(String idArtist, String artistName, String bornPlace, String gender, Date debuteDate) {
        this.idArtist = idArtist;
        this.artistName = artistName;
        this.bornPlace = bornPlace;
        this.gender = gender;
        this.debuteDate = debuteDate;
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
