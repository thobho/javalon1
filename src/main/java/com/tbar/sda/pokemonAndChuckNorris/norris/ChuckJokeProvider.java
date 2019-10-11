package com.tbar.sda.pokemonAndChuckNorris.norris;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChuckJokeProvider {
    private final static String CHUCK_JOKE_URL = "https://api.chucknorris.io/jokes/random";

    public ChuckNorrisJoke getJoke() {
        RestTemplate restTemplate = new RestTemplate();

        ChuckNorrisJoke forObject = restTemplate.getForObject(CHUCK_JOKE_URL, ChuckNorrisJoke.class);
        return forObject;
    }
}
