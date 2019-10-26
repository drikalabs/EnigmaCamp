package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplemetsArtistService implements ArtistService{
    @Autowired
    ArtistRepositories artistRepositories;

    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepositories.save(artist);
    }

    @Override
    public void deleteArtistById(String idArtist) {
        artistRepositories.deleteById(idArtist);
    }

    @Override
    public Artist getArtistById(String idArtist) {
        return artistRepositories.findById(idArtist).get();
    }

    @Override
    public List<Artist> getAllArtist() {
        return artistRepositories.findAll();
    }
}
