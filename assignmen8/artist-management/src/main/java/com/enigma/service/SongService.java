package com.enigma.service;

import com.enigma.entity.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);

    public List<Song> getAllSongs();

    public Song getSongsById(String idSong);

    public void deleteSongsById(String idSong);

    public void deleteByArtistId(String idArtist);

    public Page<Song>GetAllSongsPagination(Pageable pageable);
    public Page<Song>FindByTitle(String keyword, Pageable pageable);

}
