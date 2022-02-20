package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class DefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = req.getPathInfo().replaceFirst("/","");
        if (fileName.equals(""))
            fileName = "index.html";
        InputStream file = getClass().getClassLoader().getResourceAsStream(fileName);
        if (file==null){
            resp.setStatus(404);
            resp.getWriter().println("File Not Found");
            return;
        }
        IOUtils.copy(file, resp.getOutputStream());

    }
}
