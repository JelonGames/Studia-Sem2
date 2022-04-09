package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class zadanie1 {
    RandomAccessFile file;
    long fileLenght, pointerFile;

    public void Start(){
        try {
            file = new RandomAccessFile("H:\\studia java\\lista3 semestr2\\src\\dane1.txt", "r");
            try {
                fileLenght = file.length();
                file.seek(0);
                pointerFile = 0;
                while(pointerFile < fileLenght)
                {
                    System.out.println(file.readLine());
                    pointerFile = file.getFilePointer();
                }
            } catch (IOException e){
                System.out.println(e.fillInStackTrace());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.fillInStackTrace());
        }
    }

}
