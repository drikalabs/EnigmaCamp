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
        return artists;
    }


}
