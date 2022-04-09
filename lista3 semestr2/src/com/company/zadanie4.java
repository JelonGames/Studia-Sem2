package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class zadanie4 {

    RandomAccessFile file;
    long fileLenght, filePointer;

    public void Start(){
        try {
            file = new RandomAccessFile("H:\\studia java\\lista3 semestr2\\src\\Napis.txt", "r");
            try{
                fileLenght = file.length();
                filePointer = 15464;
                file.seek(15464);
                System.out.println("Wstaznik na początku jest na miejscu: " + file.getFilePointer() + "\n" +
                        "----------------------------------------------------------------------");
                while (filePointer < fileLenght)
                {
                    System.out.println(file.readLine());
                    filePointer = file.getFilePointer();
                }
                System.out.println("---------------------------------------------------------------------\n" +
                        "Wstaznik jest na miejscu: " + file.getFilePointer());
                System.out.println("Długość pliku wykryta to: " + fileLenght );
            } catch (IOException e)
            {
                System.out.println(e.fillInStackTrace());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
