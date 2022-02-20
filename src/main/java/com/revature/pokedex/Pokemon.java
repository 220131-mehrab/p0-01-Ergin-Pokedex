package com.revature.pokedex;

import java.util.Objects;

public class Pokemon implements Comparable<Pokemon>{

    private int dexId;
    private String name;
    private String type1;
    private String type2;

    public Pokemon(){

    }

    public Pokemon (String name){
        this(-1,name, "","");
    }

    public Pokemon(int dexId, String name, String type1, String type2) {
        this.dexId = dexId;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    public static Pokemon of(){
        return new Pokemon();
    }

    public Pokemon id(int id){
        this.dexId = id;
        return this;
    }

    public Pokemon name(String name){
        this.name = name;
        return this;
    }

    public Pokemon type1(String type1){
        this.type1 = type1;
        return this;
    }

    public Pokemon type2(String type2){
        this.type2 = type2;
        return this;
    }

    public String getName(){
        return this.name;
    }

    public int getDexId() {
        return dexId;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

//    @Override
//    public String toString(){
//        return this.name;
//    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "dexId=" + dexId +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return dexId == pokemon.dexId && Objects.equals(name, pokemon.name) && Objects.equals(type1, pokemon.type1) && Objects.equals(type2, pokemon.type2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dexId, name, type1, type2);
    }

    @Override
    public int compareTo(Pokemon o) {
        return Integer.compare(this.dexId, o.getDexId());

    }
}
