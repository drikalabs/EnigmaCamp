package com.enigma.repositories;

import com.enigma.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepositories extends JpaRepository<Song ,String> {
}
