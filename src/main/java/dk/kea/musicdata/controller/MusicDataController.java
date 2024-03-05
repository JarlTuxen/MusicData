package dk.kea.musicdata.controller;

import dk.kea.musicdata.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicDataController {

    @Autowired
    MusicRepository newMusicRepository;

    @GetMapping("/musikdata")
    public String showMusic(Model model){

        //tilføj alle titler til viewmodel, så de kan bruges af Thymeleaf i html
        model.addAttribute("albums", newMusicRepository.getAll());
        return "musikdata";
    }

}
