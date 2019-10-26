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
        String idArtist = artist.getIdArtist();
        Song song = new Song("Sabun Mandi",new Date(),idArtist);
        song= songService.saveSong(song);
        Song expected = songService.getSongsById(song.getIdSong());
        Song actual =songRepositories.findById(song.getIdSong()).get();
        assertEquals(expected,actual);
    }
//    @Test
//    public void should_get_all_data_when_getAllData(){
//        Song song1 = new Song("Sabun Mandi","Kawang",new Date());
//        Song song2 = new Song("kita Mandi","kawung",new Date());
//        song1=songRepositories.save(song1);
//        song2=songRepositories.save(song2);
//        List<Song> songs =new ArrayList<>();
//        songs.add(song1);
//        songs.add(song2);
//        assertEquals(songs,songService.getAllSongs());
//    }
//    @Test
//    public void should_data_return_same_as_id_when_getById(){
//        Song song = new Song("Sabun Mandi","Kawang",new Date());
//        song= songRepositories.save(song);
//        assertEquals(song,songService.getSongsById(song.getIdSong()));
//    }
//    @Test
//    public void should_0_when_take_data_afterdeleteSongById(){
//        Song song = new Song("Sabun Mandi","Kawang",new Date());
//        song= songRepositories.save(song);
//        songService.deleteSongsById(song.getIdSong());
//        assertEquals(0,songRepositories.findAll().size());
//    }
}