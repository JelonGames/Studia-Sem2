package com.company.clasy.Gąsienicowe;

public class Cząłg extends Gąsienicowe{
    public Cząłg(int rokProdukcji, String rodzajSilnika, String kolor, String masa, float moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, moc);
    }

    //będzie błąd bo słowo final nie pozwala nadpisać/przeciążyć metody w klasie dziedziczącej po klasie Gąsienicowe
    public void uruchomSilnik()
    {

    }
}
