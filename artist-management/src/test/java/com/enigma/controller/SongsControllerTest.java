package com.enigma.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.repositories.SongRepositories;
import com.enigma.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongsControllerTest {
    @Autowired
    ArtistRepositories artistRepositories;
    @Autowired
    SongRepositories songRepositories;

    @Autowired
    MockMvc mockMvc;

    @Before
    public void setUp()  {
        artistRepositories.deleteAll();
        songRepositories.deleteAll();
    }
    @Test
    public void should_return_status_ok_when_submit() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Artist artist =  new Artist("kiki","Medan","M",new Date());
        artist =artistRepositories.save(artist);
        Song song = new Song("Lovely Boys",new Date(),artist.getIdArtist());
        mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(song))).andExpect(status().isOk());
    }

}