package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class zadanie2 {
    RandomAccessFile file;
    long fileLenght, filePointer;
    int value;

    public void Start(){
        String temp;
        try{
            file = new RandomAccessFile("H:\\studia java\\lista3 semestr2\\src\\dane1.txt", "r");
            try{
                fileLenght = file.length();
                file.seek(0);
                filePointer = 0;
                while(filePointer < fileLenght)
                {
                    temp = file.readLine();
                    for(int i = 0; i < temp.split(" ").length; i++)
                    {
                        value += Integer.parseInt(temp.split(" ")[i]);
                    }
                    System.out.println(value);
                    filePointer = file.getFilePointer();
                }
            } catch (IOException e)
            {
                System.out.println(e.fillInStackTrace());
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }
}
