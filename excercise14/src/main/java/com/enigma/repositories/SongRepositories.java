package com.enigma.repositories;

import com.enigma.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepositories extends JpaRepository<Song, Integer> {
}
