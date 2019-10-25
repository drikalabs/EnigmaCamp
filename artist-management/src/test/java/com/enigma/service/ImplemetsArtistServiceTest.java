package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImplemetsArtistServiceTest {
    @Autowired
    ArtistService artistService;
    @Autowired
    ArtistRepositories artistRepositories;

    @Before
    public void setUp(){
        artistRepositories.deleteAll();
    }
    @Test
    public void Should_Created_inDatabase_when_Create_Artist(){
        Artist artist =new Artist("kiki","Medan","M");
        Artist expect = artistService.saveArtist(artist);
        assertEquals(expect,artistRepositories.findById(expect.getIdArtist()).get());
    }
}