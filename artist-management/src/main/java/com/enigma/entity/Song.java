package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "mst_song")
public class Song {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idSong;
    private String titleSong;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "id_artist")
    @JsonIgnore
    private Artist artist;

    @Transient
    private String idArtistContainer;

    public Song(String titleSong, Date releaseDate, String idArtistContainer) {
        this.titleSong = titleSong;
        this.releaseDate = releaseDate;
        this.idArtistContainer = idArtistContainer;
    }

    public Song() {
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getIdArtistContainer() {
        return idArtistContainer;
    }

    public void setIdArtistContainer(String idArtistContainer) {
        this.idArtistContainer = idArtistContainer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(idSong, song.idSong) &&
                Objects.equals(titleSong, song.titleSong) &&
                Objects.equals(releaseDate, song.releaseDate) &&
                Objects.equals(artist, song.artist) &&
                Objects.equals(idArtistContainer, song.idArtistContainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSong, titleSong, releaseDate, artist, idArtistContainer);
    }
}
