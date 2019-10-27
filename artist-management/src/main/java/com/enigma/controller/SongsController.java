package com.enigma.controller;

import com.enigma.entity.Song;
import com.enigma.service.ArtistService;
import com.enigma.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsController {
    @Autowired
    SongService songService;
    @Autowired
    ArtistService artistService;

    @PostMapping("/song")
    public Song saveSong(@RequestBody Song song){
        return songService.saveSong(song);
    }
}
