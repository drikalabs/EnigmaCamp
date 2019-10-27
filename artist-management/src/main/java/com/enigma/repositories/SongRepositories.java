package com.enigma.repositories;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepositories extends JpaRepository<Song ,String> {

    @Query(nativeQuery = true, value = "DELETE FROM mst_song WHERE id_artist = ?")
    void deleteByArtistid(String IdArtist);
    Page<Song>findAllByTitleSongContains(String keyword , Pageable pageable);

}
