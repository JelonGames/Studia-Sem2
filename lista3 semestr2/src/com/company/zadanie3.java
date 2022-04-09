package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class zadanie3 {

    public void Start(){
        Path path = Paths.get("H:\\studia java\\lista3 semestr2\\src\\dane2.txt");

        try{
            String tekst= new String(Files.readAllBytes(path));
            System.out.println(tekst);
        } catch (IOException e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
