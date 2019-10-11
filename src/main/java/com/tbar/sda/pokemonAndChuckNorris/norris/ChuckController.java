package com.tbar.sda.pokemonAndChuckNorris.norris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {

    private final ChuckJokeProvider chuckJokeProvider;

    public ChuckController(@Autowired ChuckJokeProvider chuckJokeProvider) {
        this.chuckJokeProvider = chuckJokeProvider;
    }

    @RequestMapping("/randomChuck")
    @GetMapping
    public String getRandomChuckJoke(Model model) {

        model.addAttribute("joke", chuckJokeProvider.getJoke().getValue());

        return "randomChuckPage";
    }


}
