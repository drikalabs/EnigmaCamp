package com.enigma.controller;

import com.enigma.entity.Song;
import com.enigma.service.ArtistService;
import com.enigma.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongsController {
    @Autowired
    SongService songService;
    @Autowired
    ArtistService artistService;

    @CrossOrigin
    @PostMapping("/song")
    public Song saveSong(@RequestBody Song song){
        return songService.saveSong(song);
    }
    @CrossOrigin
    @GetMapping("/song")
    public List<Song>getAllSongs(){
        return songService.getAllSongs();
    }
    @CrossOrigin
    @GetMapping("/songs")
    public Page<Song>getSogsWithPagination(@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return  songService.GetAllSongsPagination(pageable);
    }
    @CrossOrigin
    @GetMapping("/song/{keyword}")
    public  Page<Song>searchSongsBytitle(@PathVariable String keyword,@RequestParam Integer page,@RequestParam Integer size){
        Pageable pageable =PageRequest.of(page,size);
        return songService.FindByTitle(keyword,pageable);
    }
}
