package com.company.clasy.Szynowe;

import com.company.clasy.Pojazd;

public class Szynowe extends Pojazd {
    public Szynowe(int rokProdukcji, String rodzajSilnika, String kolor, String masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    public void uruchomSilnik()
    {
        System.out.println("uruchomiono silnik pojazdu szynowego");
    }
}
