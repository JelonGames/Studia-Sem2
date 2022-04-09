package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("1. Wczytaj dane z pliku tekstowego dane1.txt i wyświetl je na ekranie. https://drive.google.com/open?id=1OjMq0iTSZj9wrjcZapcNjtoW1vENzWBW\n" +
                "2. W pliku dane1.txt znajdują się liczby typu int. Napisz program, który wczyta dane z pliku i wyświetli ich sumę.\n" +
                "3. Wczytaj w całości zawartość pliku dane2.txt i wyświetl go na ekranie (nie używając do tego pętli i podejście sekwencyjnego wprowadzania danych). https://drive.google.com/open?id=1zxu3v3KnZjIdhOJM-y32sOQKirAh8Hhe\n" +
                "4. W pliku napis.txt znajduje się ponad 1000 wierszy. Napisz program wczytujący wiersz tekstu rozpoczynający się od pozycji 15464. Program nie powinien wykorzystywać pętli, ale przenieść wskaźnik pliku do podanego w nim miejsca.\n" +
                "5. Napisz program, który ze strony internetowej o wskazanym adresie wyświetla tylko te linie, które zawierają znak “@”. [Operacje wejścia-wyjścia + operacja na tekście].\n" +
                "6. Napisz program, który ze strony internetowej o wskazanym adresie, wyświetla tylko te linie, które zawierają znak “@”, pod warunkiem że  nie występują w @media [Operacje wejścia-wyjścia + operacja na tekście].\n" +
                "7. Napisz program, który ze strony internetowej o wskazanym adresie, wyszuka i wypisze adresy e-mail [Operacje wejścia-wyjścia + wyrażenia regularne].\n" +
                "8. Napisz program, który określi dla jak dużych liczb typ BigInteger przy wykonywaniu obliczeń pojawi się błąd lub wyjątek. [BigInteger]"));
        System.out.println("\nWybierz zadanie: ");
        int chose = scanner.nextInt();

        switch (chose)
        {
            case 1:
                zadanie1 zad = new zadanie1();
                zad.Start();
                break;
            case 2:
                zadanie2 zad2 = new zadanie2();
                zad2.Start();
                break;
            case 3:
                zadanie3 zad3 = new zadanie3();
                zad3.Start();
                break;
            case 4:
                zadanie4 zad4 = new zadanie4();
                zad4.Start();
                break;
            case 8:
                zadanie8 zad8 = new zadanie8();
                zad8.Start();
                break;
            default:
                System.out.println("Nie umiem tego zadania zrobić");
                main(null);
                break;
        }

    }
}
