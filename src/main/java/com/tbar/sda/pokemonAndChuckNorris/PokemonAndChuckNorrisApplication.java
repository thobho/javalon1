package com.tbar.sda.pokemonAndChuckNorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.tbar.sda.pokemonAndChuckNorris.pokemon",
        "com.tbar.sda.pokemonAndChuckNorris.norris",
        "com.tbar.sda.pokemonAndChuckNorris.movies"
})
public class PokemonAndChuckNorrisApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonAndChuckNorrisApplication.class, args);
    }

}
