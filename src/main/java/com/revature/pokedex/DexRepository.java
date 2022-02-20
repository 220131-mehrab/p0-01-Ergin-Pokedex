package com.revature.pokedex;

import java.util.List;

public interface DexRepository {
    Pokemon getPokemon(String name);
    List<Pokemon> getPocketMonsters();
}
