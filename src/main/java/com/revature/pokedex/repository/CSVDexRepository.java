package com.revature.pokedex.repository;

//import java.io.File;
//import java.io.FileNotFoundException;
import com.revature.pokedex.domain.Pokemon;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVDexRepository implements DexRepository {
    private List<Pokemon> pocketMonsters;// = new ArrayList<>();
    //private File file;
    private InputStream file;

    public CSVDexRepository(String filename) {
        this.pocketMonsters = new ArrayList<>();
        //this.file = new File("src/main/resources/"+filename);
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
        

    }

    private void load() {
        Scanner scanner = new Scanner(this.file,"UTF-8");
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            String[] pokeColumns = scanner.next().split(",");
            Pokemon temp = new Pokemon(pokeColumns[2]);
            this.pocketMonsters.add(temp);
        }
    }

    public List<Pokemon> getPocketMonsters() {
        return pocketMonsters;
    }

    public Pokemon getPokemon(String name){
        Pokemon result = null;
        for (Pokemon pokemon: this.pocketMonsters){
            if (pokemon.getName().equals(name)){
                result = pokemon;
            }
        }
        return result;
    }
}
