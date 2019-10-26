package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArtistControllerTest {
    @Autowired
    ArtistRepositories artistRepositories;

    @Autowired
    MockMvc mockMvc;

    @Before
    public void setUp(){
        artistRepositories.deleteAll();
    }
    @Test
    public void Sould_return_status_OK()throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Artist artist =new Artist("kiki","Medan","M",new Date());
        mockMvc.perform(post("/artist")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(artist))).andExpect(status().isOk());
    }
}