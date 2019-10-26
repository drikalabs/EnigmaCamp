package com.enigma.service;

import com.enigma.entity.Artist;

import java.util.List;

public interface ArtistService {
    public Artist saveArtist(Artist artist);

    public List<Artist> getAllArtist();

    public Artist getArtistById(String idArtist);

    public void deleteArtistById(String idArtist);
}
