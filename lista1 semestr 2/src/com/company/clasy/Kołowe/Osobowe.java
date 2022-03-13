package com.company.clasy.Kołowe;

public class Osobowe extends Kołowe{
    int ilośćOsób;

    public Osobowe(int rokProdukcji, String rodzajSilnika, String kolor, String masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.ilośćOsób = ilośćOsób;
    }

    public Osobowe()
    {

    }

    public int getIlośćOsób() {
        return ilośćOsób;
    }

    public void setIlośćOsób(int ilośćOsób) {
        this.ilośćOsób = ilośćOsób;
    }
}
