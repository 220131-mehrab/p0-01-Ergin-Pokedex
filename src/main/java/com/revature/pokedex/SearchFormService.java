package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<Html>\n" +
                "<Head>\n" +
                "    <Title>" +
                "Search Pokedex</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "    <form action='/pokemon'>\n" +
                "    " +
                "    " +
                "<input type='name' name='searchName'/>" +
                "        \n" +
                "        <input type='submit' value='Search'/>\n" +
                "    </form>\n" +
                "</Body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLForm);
    }
}
