package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date debuteDate;

    @OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<Song>songList =new ArrayList<>();

    public Artist() {
    }

    public Artist(String artistName, String bornPlace, String gender,Date debuteDate) {
        this.artistName = artistName;
        this.bornPlace = bornPlace;
        this.gender = gender;
        this.debuteDate=debuteDate;
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

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(idArtist, artist.idArtist) &&
                Objects.equals(artistName, artist.artistName) &&
                Objects.equals(bornPlace, artist.bornPlace) &&
                Objects.equals(gender, artist.gender) &&
                Objects.equals(debuteDate, artist.debuteDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtist, artistName, bornPlace, gender, debuteDate);
    }
}
