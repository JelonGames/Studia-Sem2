package com.company.piętnaście;

import com.company.czternaście.DrugiInterface;
import com.company.czternaście.PierwszyInterface;

public class MojaKlasa implements PierwszyInterface, DrugiInterface {

    /*
    * Klasa ta musi mieć teraz kilka tych samych funkcji ale przyjmujące różne wartości
    * */
    @Override
    public void f(int a) {
        System.out.println("f");
    }

    @Override
    public void f(double b) {
        System.out.println("F");
    }
}
