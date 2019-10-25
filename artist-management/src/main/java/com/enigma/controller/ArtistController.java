package com.enigma.controller;

import com.enigma.entity.Artist;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    ObjectMapper objectMapper;
    @CrossOrigin
    @GetMapping("/artist")
    public List<Artist> GetAllArtist () throws JsonProcessingException {
        List<Artist> artists =new ArrayList<>();
        artists.add(new Artist("1","kiki","Medan","M",new Date()));
        artists.add(new Artist("2","are","Medan","M",new Date()));
        artists.add(new Artist("3","you","Medan","M",new Date()));
        artists.add(new Artist("4","Love","Medan","M",new Date()));
        artists.add(new Artist("5","me","Medan","M",new Date()));
        artists.add(new Artist("6","and","Medan","M",new Date()));
        artists.add(new Artist("7","i","Medan","M",new Date()));
        artists.add(new Artist("8","wish","Medan","M",new Date()));
        return artists;
    }


}
