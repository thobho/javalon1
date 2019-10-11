package com.tbar.sda.pokemonAndChuckNorris.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoveDTO {
    private String name;
    private String url;









    public MoveDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String moveName) {
        this.name = moveName;
    }
}
