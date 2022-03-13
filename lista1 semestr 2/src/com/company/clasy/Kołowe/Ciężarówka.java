package com.company.clasy.Kołowe;

public class Ciężarówka extends Kołowe {
    float udźwig;

    public Ciężarówka(int rokProdukcji, String rodzajSilnika, String kolor, String masa, String rozmiarOpony, float udźwig) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udźwig = udźwig;
    }

    public Ciężarówka(){

    }

    public float getUdźwig() {
        return udźwig;
    }

    public void setUdźwig(float udźwig) {
        this.udźwig = udźwig;
    }
}
