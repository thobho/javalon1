package com.tbar.sda.pokemonAndChuckNorris.pokemon;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sun.reflect.generics.scope.Scope;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PokemonProvider {

    private final static String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon";

    public PokemonDTO getPokemon(int id) {
        RestTemplate restTemplate = new RestTemplate();
        String fullUrl = POKEMON_URL + "/" + id;

        HttpEntity<String> entity = createHttpEntity();

        HttpEntity<PokemonDTO> response = restTemplate
                .exchange(fullUrl, HttpMethod.GET, entity, PokemonDTO.class);
        return response.getBody();
    }

    public List<PokemonDTO> getPokemonByWeight(int minWeight, int maxWeight) {
        return IntStream.range(1, 10)
                .mapToObj(this::getPokemon)
                .filter(pokemonDTO -> pokemonDTO.getWeight() > minWeight & pokemonDTO.getWeight() < maxWeight)
                .collect(Collectors.toList());
    }


    private HttpEntity<String> createHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        return new HttpEntity<>("parameters", headers);
    }
}
