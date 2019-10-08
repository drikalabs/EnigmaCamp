package com.enigma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Song {
    @Id
    private Integer idSong;
    @ManyToOne
    private Artist idArtist;

    private String titleSong;


    public Song(Integer idSong, Artist idArtist, String titleSong) {
        this.idSong = idSong;
        this.idArtist = idArtist;
        this.titleSong = titleSong;
    }

    public Song() {
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public Artist getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }
}
