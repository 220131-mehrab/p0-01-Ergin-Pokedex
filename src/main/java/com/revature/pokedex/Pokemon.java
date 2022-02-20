package com.revature.pokedex;

public class Pokemon {
    private String name;

    public Pokemon (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
