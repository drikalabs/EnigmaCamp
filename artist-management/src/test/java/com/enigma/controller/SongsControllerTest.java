package com.enigma.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.repositories.SongRepositories;
import com.enigma.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        songRepositories.deleteAll();
        artistRepositories.deleteAll();
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
    @Test
    public void should_return_write_in_db_whenSaveSongs()throws Exception{
        ObjectMapper objectMapper =new ObjectMapper();
        Artist artist =new Artist("kiki","Medan","M",new Date());
        artist = artistRepositories.save(artist);
        Song song =new Song("Lovely Boys",new Date(),artist.getIdArtist());
        song =songRepositories.save(song);
        String response = mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(song))).andReturn().getResponse().getContentAsString();
        Song expectSong =new ObjectMapper().readValue(response,Song.class);
        Assert.assertEquals(expectSong,songRepositories.findById(song.getIdSong()).get());
    }
//    @Test
//    public void should_return_list_of_songs()throws Exception{
//        ObjectMapper objectMapper =new ObjectMapper();
//        Artist artist =new Artist("kiki","Medan","M",new Date());
//        artist = artistRepositories.save(artist);
//        Song song1 =new Song("Lovely Boys",new Date(),artist.getIdArtist());
//        Song song2 =new Song("Lovely",new Date(),artist.getIdArtist());
//        Song song3 =new Song("Lovely girls",new Date(),artist.getIdArtist());
//        song1=songRepositories.save(song1);
//        song2=songRepositories.save(song2);
//        song3=songRepositories.save(song3);
//        List<Song>songs=new ArrayList<>();
//        songs.add(song1);
//        songs.add(song2);
//        songs.add(song3);
//
//        String response =mockMvc.perform(get("/song")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(songs)))
//                .andReturn().getResponse().getContentAsString();
//
//        songs= (List<Song>) new ObjectMapper().readValue(response,Song.class);
//        Assert.assertEquals(songs.size(), songRepositories.findAll().size());
//
//    }


}