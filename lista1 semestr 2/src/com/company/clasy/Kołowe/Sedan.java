package com.company.clasy.Kołowe;

public class Sedan extends Osobowe{
    String model;
    String symbol;

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, String masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }

    public Sedan(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
