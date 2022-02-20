package com.revature.pokedex.servlet;

import com.revature.pokedex.domain.Pokemon;
import com.revature.pokedex.repository.DexRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DexService extends HttpServlet {
    private DexRepository dexRepository;

    public DexService(DexRepository dexRepository) {
        this.dexRepository = dexRepository;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");
        if (userInput!=null){
            String result = dexRepository.getPokemon(userInput).getName();
            resp.getWriter().println(result);
        } else {

            for (Pokemon pokemon : dexRepository.getPocketMonsters()) {
                resp.getWriter().println(pokemon);
            }
        }
    }
}
