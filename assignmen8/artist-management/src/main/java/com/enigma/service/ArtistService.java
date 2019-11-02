package com.enigma.service;

import com.enigma.entity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArtistService {
    public Artist saveArtist(Artist artist);

    public List<Artist> getAllArtist();

    public Artist getArtistById(String idArtist);

    public void deleteArtistById(String idArtist);

    public Page<Artist>getArtistWIthPagination(Pageable pageable);

    public Page<Artist>getArtistBySpecification(Artist artist, Pageable pageable);
    public Page<Artist>getArtistByName(String keyword ,Pageable pageable);
}
