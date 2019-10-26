package com.enigma.service;

import com.enigma.entity.Song;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);

    public List<Song> getAllSongs();

    public Song getSongsById(String idSong);

    public void deleteSongsById(String idSong);
}
