package com.company.clasy.Szynowe;

public class Pociąg extends Szynowe{
    static String właściciel = "P.K.P";

    public Pociąg(int rokProdukcji, String rodzajSilnika, String kolor, String masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    public static String getWłaściciel() {
        return właściciel;
    }

    public static void setWłaściciel(String właściciel) {
        Pociąg.właściciel = właściciel;
    }
}
