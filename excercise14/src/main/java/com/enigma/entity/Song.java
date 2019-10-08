package com.enigma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    private Integer idSong;
    private Integer idArtist;
    private String titleSong;

    public Song(Integer idSong, Integer idArtist, String titleSong) {
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

    public Integer getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Integer idArtist) {
        this.idArtist = idArtist;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }
}
