package com.enigma.service;

import com.enigma.repositories.SongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementsSongService implements SongService {
    @Autowired
    SongRepositories songRepositories;
}
