package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.repositories.SongRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImplementsSongServiceTest {
    @Autowired
    SongRepositories songRepositories;
    @Autowired
    ArtistRepositories artistRepositories;
    @Autowired
    SongService songService;
    @Autowired
    ArtistService artistService;

    @Before
    public void setUp(){
        songRepositories.deleteAll();
        artistRepositories.deleteAll();
    }
    @Test
    public void should_created_in_Database_when_created_Song(){
        Artist artist = new Artist("kiki","Jakarta","M",new Date());
        artist=artistRepositories.save(artist);
        Song song = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        song= songService.saveSong(song);
        Song actual =songRepositories.findById(song.getIdSong()).get();
        assertEquals(song,actual);
    }
    @Test
    public void should_get_all_data_when_getAllData(){
        Artist artist = new Artist("kiki","Jakarta","M",new Date());
        artist=artistRepositories.save(artist);
        Song song1 = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        Song song2 = new Song("Lovely Girls",new Date(),artist.getIdArtist());
        song1=songService.saveSong(song1);
        song2=songService.saveSong(song2);
        List<Song>expected=new ArrayList<>();
        expected.add(song1);
        expected.add(song2);
        assertEquals(expected,songService.getAllSongs());
    }
    @Test
    public void should_data_return_same_as_id_when_getById(){
        Artist artist = new Artist("kiki","Jakarta","M",new Date());
        artist=artistRepositories.save(artist);
        Song song = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        song= songService.saveSong(song);
        assertEquals(song,songRepositories.findById(song.getIdSong()).get());
    }
    @Test
    public void should_0_when_take_data_afterdeleteSongById(){
        Artist artist = new Artist("kiki","Jakarta","M",new Date());
        artist=artistRepositories.save(artist);
        Song song = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        songService.saveSong(song);
        songService.deleteSongsById(song.getIdSong());
        assertEquals(0,songRepositories.findAll().size());
    }
    @Test
    public void shoul_return_data_with_pageable(){
        Artist artist = new Artist("kiki","Jakarta","M",new Date());
        artist=artistRepositories.save(artist);
        Song song1 = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        Song song2 = new Song("Lovely Girls",new Date(),artist.getIdArtist());
        song1=songService.saveSong(song1);
        song2=songService.saveSong(song2);
        List<Song>expected=new ArrayList<>();
        expected.add(song1);
        expected.add(song2);
        Pageable pageable = PageRequest.of(0,2);
        assertEquals(expected.size(),songService.GetAllSongsPagination(pageable).getTotalElements());
    }
}