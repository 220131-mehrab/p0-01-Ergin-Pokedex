package com.revature.pokedex.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pokedex.domain.PokeAPImon;
import com.revature.pokedex.domain.Pokemon;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class PokeAPIDexRepository implements DexRepository{
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public Pokemon getPokemon(String name) {
        Pokemon result = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + name))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String httpBody = response.body();
            result = mapper.readValue(httpBody, PokeAPImon.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Pokemon> getPocketMonsters() {
        return null;
    }
}
