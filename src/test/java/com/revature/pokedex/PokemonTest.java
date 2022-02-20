package com.revature.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PokemonTest {
    @Test
    public void constructorTest(){
        String name = "Bulbasaur";
        Pokemon pokemon = new Pokemon(name);
        pokemon = new Pokemon(2, "Ivysaur", "Grass", "Poison");
    }

    @Test
    public void builderTest(){
        Pokemon actual = Pokemon.of().id(1).name("Bulbasour").type1("Grass").type2("Poison");
        Assertions.assertEquals("Bulbasour",actual.getName());
        actual = Pokemon.of().type2("Poison").name("Ivysaur").id(2);
    }
    @Test
    public void nameTest(){
        Pokemon pokemon = new Pokemon("Squirtle");
        Assertions.assertEquals("Squirtle", pokemon.getName());
        pokemon = new Pokemon("Charmander");
        Assertions.assertEquals("Charmander", pokemon.getName());
    }
    @Test
    public void comparetorTest(){
        List<Pokemon> pokemonList = Arrays.asList(
                Pokemon.of().id(1).name("Bulbasaur").type1("Grass").type2("Poison"),
                Pokemon.of().id(2).name("Bulbasaur").type1("Grass").type2("Poison"),
                Pokemon.of().id(3).name("Squirtle").type1("Water").type2(""),
                Pokemon.of().id(1).name("Bulbasaur").type1("Grass").type2("Poison")
        );
        System.out.println(pokemonList.toString());

        pokemonList.sort(null);
        System.out.println(pokemonList.toString());

//        pokemonList.sort(new Comparator<Pokemon>() {
//            @Override
//            public int compare(Pokemon o1, Pokemon o2) {
//                return Integer.compare(o1.getName().length(),o2.getName().length());
//            }
//        });
//        pokemonList.sort((Comparator<Pokemon>) (Pokemon o1, Pokemon o2)->{
//            return Integer.compare(o1.getName().length(),o2.getName().length());
//        });

        pokemonList.sort((o1,o2)->Integer.compare(o1.getName().length(),o2.getName().length()));
        System.out.println(pokemonList.toString());
    }

}
