package com.enigma.service;

import com.enigma.repositories.SongRepositories;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImplementsSongServiceTest {
    @Autowired
    SongRepositories songRepositories;
    @Autowired
    SongService songService;

    @Before
    public void setUp(){
        songRepositories.deleteAll();
    }
}