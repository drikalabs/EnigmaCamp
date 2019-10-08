package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepositories;
import com.enigma.repositories.SongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepositories songRepositories;
    @Autowired
    ArtistRepositories artistRepositories;

    @GetMapping("/songs")
    public String SongList(Model model) {
        List<Song> songs = songRepositories.findAll();
        model.addAttribute("song", songs);
        return "songs/songs-list";
    }

    @GetMapping("songs-form")
    public ModelAndView toStudentForm(Model model) {
        List<Artist> artists = artistRepositories.findAll();
        model.addAttribute("artist", artists);
        return new ModelAndView("songs/songs-form", "song", new Song());
    }

    @PostMapping("/songs")
    public String doSongAction(@ModelAttribute("song") Song song, Model model) {
        songRepositories.save(song);
        return "redirect:/songs";
    }
}
