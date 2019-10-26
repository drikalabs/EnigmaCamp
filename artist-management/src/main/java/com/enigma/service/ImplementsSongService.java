package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.SongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementsSongService implements SongService {
    @Autowired
    SongRepositories songRepositories;
    @Autowired
    ArtistService artistService;

    @Override
    public Song getSongsById(String idSong) {
        return songRepositories.findById(idSong).get();
    }

    @Override
    public Song saveSong(Song song) {
        Artist artist =artistService.getArtistById(song.getIdArtistContainer());
        song.setArtist(artist);
        return songRepositories.save(song);
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepositories.findAll();
    }

    @Override
    public void deleteSongsById(String idSong) {
        songRepositories.deleteById(idSong);
    }
}
