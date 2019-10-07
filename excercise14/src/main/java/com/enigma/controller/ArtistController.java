package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ArtistController {
    @Autowired
    ArtistRepositories artistRepositories;

    @GetMapping("/artist")
    public String ToArtistlist(Model model){
        List<Artist> artists =artistRepositories.findAll();

        model.addAttribute("artistlist",artists);
        return "artist/artist-views";
    }
    @GetMapping("/artist-form")
     public ModelAndView toArtistForm(Model model){
        return new ModelAndView("artist/artist-form","artist",new Artist());
    }
    @PostMapping("/artist")
    public String artistAction(@ModelAttribute("artist") Artist artist, Model model){
        artistRepositories.save(artist);
        return "redirect:/artist";
    }

}
