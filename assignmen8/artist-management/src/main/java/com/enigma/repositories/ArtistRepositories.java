package com.enigma.repositories;

import com.enigma.entity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepositories extends JpaRepository  <Artist ,String>, JpaSpecificationExecutor<Artist> {
    public Page<Artist>findAllByArtistNameContains(String keyword, Pageable pageable);
}
