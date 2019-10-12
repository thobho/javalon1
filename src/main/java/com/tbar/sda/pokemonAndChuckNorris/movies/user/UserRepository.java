package com.tbar.sda.pokemonAndChuckNorris.movies.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserDocument, String> {

    boolean existsByUsername(String username);

    UserDocument getById(String id);

}
