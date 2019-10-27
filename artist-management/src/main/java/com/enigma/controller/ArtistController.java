package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    ArtistService artistService;
    @CrossOrigin
    @PostMapping("/artist")
    public Artist SaveArtist(@RequestBody Artist artist){
        return artistService.saveArtist(artist);
    }
    @CrossOrigin
    @GetMapping("/artist")
    public List<Artist> getAllArtist(){
        return artistService.getAllArtist();
    }

    @CrossOrigin
    @GetMapping("/artists")
    public Page<Artist>getArtistWithPagination(@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return artistService.getArtistWIthPagination(pageable);
    }
    @CrossOrigin
    @GetMapping("/artists/{keyword}")
    public Page<Artist>artists (@PathVariable String keyword,@RequestParam Integer page, @RequestParam Integer size){
        Pageable pageable =PageRequest.of(page,size);
        return artistService.getArtistByName(keyword,pageable);
    }
    @CrossOrigin
    @GetMapping("/search")
    public Page<Artist>findByUserSpecification(@RequestBody Artist atistkey ,@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable =PageRequest.of(page,size);
        return artistService.getArtistBySpecification(atistkey,pageable);
    }
}
