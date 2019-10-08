package com.enigma.repositories;

import com.enigma.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepositories extends JpaRepository<Artist, Integer> {
}
