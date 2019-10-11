package com.tbar.sda.pokemonAndChuckNorris.pokemon;

import java.util.List;

public class PokemonDTO {
    private String name;
    private Integer height;
    private Integer weight;
    private List<PokemonMoveDTO> moves;

    public PokemonDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<PokemonMoveDTO> getMoves() {
        return moves;
    }

    public void setMoves(List<PokemonMoveDTO> moves) {
        this.moves = moves;
    }
}
