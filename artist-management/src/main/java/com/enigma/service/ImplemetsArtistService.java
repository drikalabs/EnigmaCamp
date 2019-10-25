package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplemetsArtistService implements ArtistService{
    @Autowired
    ArtistRepositories artistRepositories;

    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepositories.save(artist);
    }
}
