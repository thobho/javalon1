package com.tbar.sda.pokemonAndChuckNorris.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesProvider {
    private static final String MOVIE_API_URL = "http://www.omdbapi.com/?apikey=8662c07a&s=";
    public List<Movie> getMovies(String searchQuery){
        RestTemplate restTemplate = new RestTemplate();
        SearchMovieResponse forObject = restTemplate
                .getForObject(MOVIE_API_URL + searchQuery, SearchMovieResponse.class);
        return forObject.getSearch();
    }
}
