package com.company.clasy.Kołowe;

import com.company.clasy.Pojazd;

public class Kołowe extends Pojazd {
    String rozmiarOpony;

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, String masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kołowe(){

    }

    public String  getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public void uruchomSilnik(String rodzajSilnika)
    {
        System.out.println(rodzajSilnika);
    }
}
