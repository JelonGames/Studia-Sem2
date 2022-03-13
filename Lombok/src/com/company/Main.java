package com.company;

public class Main {

    public static void main(String[] args) {
	Człowiek janiak = Człowiek.builder()
            .Imie("Jan")
            .Nazwisko("Kowalski")
            .Wzrost(145)
            .build();
    Człowiek2 tajniak2 = new Człowiek2("Jan", "Kowalski", 125986547);
    }
}
