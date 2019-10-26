package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
    private String artistName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date releaseDate;

    public Song(String titleSong, String artistName, Date releaseDate) {

        this.titleSong = titleSong;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
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

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(idSong, song.idSong) &&
                Objects.equals(titleSong, song.titleSong) &&
                Objects.equals(artistName, song.artistName) &&
                Objects.equals(releaseDate, song.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSong, titleSong, artistName, releaseDate);
    }
}
