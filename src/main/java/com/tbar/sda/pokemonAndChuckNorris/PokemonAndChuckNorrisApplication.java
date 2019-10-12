package com.tbar.sda.pokemonAndChuckNorris;

import com.tbar.sda.pokemonAndChuckNorris.movies.user.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {
        "com.tbar.sda.pokemonAndChuckNorris.pokemon",
        "com.tbar.sda.pokemonAndChuckNorris.norris",
        "com.tbar.sda.pokemonAndChuckNorris.movies"
})
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class PokemonAndChuckNorrisApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(PokemonAndChuckNorrisApplication.class, args);
    }

}
