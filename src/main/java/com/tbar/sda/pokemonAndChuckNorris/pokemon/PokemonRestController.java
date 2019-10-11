package com.tbar.sda.pokemonAndChuckNorris.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class PokemonRestController {

    private PokemonProvider pokemonProvider;

    public PokemonRestController(@Autowired PokemonProvider pokemonProvider) {
        this.pokemonProvider = pokemonProvider;
    }

    @GetMapping
    @RequestMapping("/getRandomPokemon")
    public PokemonDTO providePokemon() {

        int randomId = new Random().nextInt(30) + 1;
        return pokemonProvider.getPokemon(randomId);

    }

    @GetMapping
    @RequestMapping("/pokemon/{id}")
    public PokemonDTO getPokemonById(
            @PathVariable("id") int id) {
        return pokemonProvider.getPokemon(id);
    }

    @PostMapping
    @RequestMapping("/pokemon")
    public PokemonDTO getPokemonByIdRequestParam(@RequestParam int id) {
        return pokemonProvider.getPokemon(id);
    }

    @PostMapping
    @RequestMapping("/pokemon/weight")
    public List<PokemonDTO> getPokemonByWeigth(@RequestParam int minWeight,
                                               @RequestParam int maxWeight) {
        return pokemonProvider.getPokemonByWeight(minWeight, maxWeight);
    }

}
