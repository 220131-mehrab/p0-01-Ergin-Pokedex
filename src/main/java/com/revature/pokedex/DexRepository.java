package com.revature.pokedex;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DexRepository {
    private List<String> pocketMonsters;// = new ArrayList<>();
    //private File file;
    private InputStream file;

    public DexRepository(String filename) {
        this.pocketMonsters = new ArrayList<>();
        //this.file = new File("src/main/resources/"+filename);
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
        

    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            this.pocketMonsters.add(scanner.next());
        }//try catch was deleted from here
    }

    public List<String> getPocketMonsters() {
        return pocketMonsters;
    }
}
