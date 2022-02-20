package com.revature.pokedex.repository;

import com.revature.pokedex.domain.Pokemon;

import java.util.List;

public interface DexRepository {
    Pokemon getPokemon(String name);
    List<Pokemon> getPocketMonsters();
}
