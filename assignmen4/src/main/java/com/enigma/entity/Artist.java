package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Artist {
    @Id
    private Integer idArtist;

    private String name;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date debuteDate;
    private String bornPlace;

    @OneToMany(mappedBy = "idArtist")
    private List<Song>songs;

    public Artist(Integer idArtist, String name, Date debuteDate, String bornPlace, List<Song> songs) {
        this.idArtist = idArtist;
        this.name = name;
        this.debuteDate = debuteDate;
        this.bornPlace = bornPlace;
        this.songs = songs;
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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
