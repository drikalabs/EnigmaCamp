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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class ArtistController {
    @Autowired
    ArtistService artistService;
    @Autowired
    ObjectMapper mapper;
    @PostMapping("/artist")
    public Artist SaveArtist(@RequestBody Artist artist){
        return artistService.saveArtist(artist);
    }

    @GetMapping("/artist")
    public List<Artist> getAllArtist(){
        return artistService.getAllArtist();
    }

    @GetMapping("/artists")
    public Page<Artist>getArtistWithPagination(@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return artistService.getArtistWIthPagination(pageable);
    }
    @GetMapping("/artists/{keyword}")
    public Page<Artist>artists (@PathVariable String keyword,@RequestParam Integer page, @RequestParam Integer size){
        Pageable pageable =PageRequest.of(page,size);
        return artistService.getArtistByName(keyword,pageable);
    }
    @GetMapping("/search")
    public Page<Artist>findByUserSpecification(@RequestBody Artist atistkey ,@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable =PageRequest.of(page,size);
        return artistService.getArtistBySpecification(atistkey,pageable);
    }
    @PostMapping("/saveartist")
    public Artist saveWithImage(@RequestPart MultipartFile file,@RequestPart String data)throws IOException{
        Artist artist= artistService.saveArtist(mapper.readValue(data,Artist.class));
        try{
            byte[]bytes = file.getBytes();
            Path path = Paths.get("/var/www/html/img/"+artist.getIdArtist()+".jpg");
            Files.write(path,bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return artist;
    }
    @DeleteMapping("artist/{idArtist}")
    public void deleteArtist(@PathVariable String idArtist){
        artistService.deleteArtistById(idArtist);
    }
}
