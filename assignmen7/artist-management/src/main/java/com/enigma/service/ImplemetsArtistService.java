package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.specification.ArtistSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplemetsArtistService implements ArtistService{
    @Autowired
    ArtistRepositories artistRepositories;

    @Autowired
    SongService songService;

    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepositories.save(artist);
    }
    @Override
    public void deleteArtistById(String idArtist) {
//        songService.deleteByArtistId(idArtist);
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
    @Override
    public Page<Artist> getArtistWIthPagination(Pageable pageable) {
        return artistRepositories.findAll(pageable);
    }
    @Override
    public Page<Artist> getArtistBySpecification(Artist artist, Pageable pageable) {
        return artistRepositories.findAll(ArtistSpecification.findByKriteria(artist),pageable);
    }

    @Override
    public Page<Artist> getArtistByName(String keyword, Pageable pageable) {
        return artistRepositories.findAllByArtistNameContains(keyword,pageable);
    }
}
