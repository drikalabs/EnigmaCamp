package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.repositories.SongRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImplemetsArtistServiceTest {
    @Autowired
    ArtistService artistService;
    @Autowired
    ArtistRepositories artistRepositories;
    @Autowired
    SongRepositories songRepositories;

    @Before
    public void setUp(){
        songRepositories.deleteAll();
        artistRepositories.deleteAll();
    }
    @Test
    public void Should_Created_inDatabase_when_Create_Artist(){
        Artist artist =new Artist("kiki","Medan","M",new Date());
        Artist expect = artistService.saveArtist(artist);
        assertEquals(expect,artistRepositories.findById(expect.getIdArtist()).get());
    }
    @Test
    public  void Shoud_return_all_artist_when_getAll(){
        Artist artist1 =new Artist("kiki","Medan","M",new Date());
        Artist artist2 =new Artist("yoga","jakarta","F",new Date());
        artist1 = artistRepositories.save(artist1);
        artist2 = artistRepositories.save(artist2);
        List<Artist>artists=new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);
        assertEquals(artists,artistService.getAllArtist());
    }
    @Test
    public void Should_return_Same_Artist_When_GetUser_byID(){
        Artist artist =new Artist("kiki","Medan","M",new Date());
        Artist expect = artistService.saveArtist(artist);
        assertEquals(expect,artistService.getArtistById(expect.getIdArtist()));
    }
    @Test
    public void Should_No_artist_when_Delete_Artist(){
        Artist artist =new Artist("kiki","Medan","M",new Date());
        artist = artistService.saveArtist(artist);
        artistService.deleteArtistById(artist.getIdArtist());
        assertEquals(0,artistRepositories.findAll().size());
    }
}