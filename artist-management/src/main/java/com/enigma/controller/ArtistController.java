package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    ArtistService artistService;

    @PostMapping("/artist")
    public Artist SaveArtist(@RequestBody Artist artist){
        return artistService.saveArtist(artist);
    }
}
