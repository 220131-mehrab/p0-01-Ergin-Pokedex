package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main (String[] args){
        String webAppName = "pokedex";
        DexRepository dexRepository;
        //File fileSource = new File("pokedex.csv");
        //CSVDexRepository dexRepository = new CSVDexRepository("pokedex.csv");
        dexRepository = new InMemoryDexRepository();
        DexService dexService = new DexService(dexRepository);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();
        server.addContext(webAppName ,null);

        server.addServlet(webAppName,"DefaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName,"dexServlet",dexService).addMapping("/pokemon");
        server.addServlet(webAppName,"searchFormServlet",sfService).addMapping("/search");
        //System.out.println("Server running on http://localhost:" + server.getConnector().getPort());
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }


}
