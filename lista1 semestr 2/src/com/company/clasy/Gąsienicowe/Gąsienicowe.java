package com.company.clasy.Gąsienicowe;

import com.company.clasy.Pojazd;

public class Gąsienicowe extends Pojazd {
    float moc;

    public Gąsienicowe(int rokProdukcji, String rodzajSilnika, String kolor, String masa, float moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public Gąsienicowe(){

    }

    public float getMoc() {
        return moc;
    }

    public void setMoc(float moc) {
        this.moc = moc;
    }

    // protected wyrzuca błąd java: uruchomSilnik() in com.company.clasy.Gąsienicowe.Gąsienicowe cannot override uruchomSilnik() in com.company.clasy.Pojazd
    //  attempting to assign weaker access privileges; was public
    /*final public*/ /*protected*/ public void uruchomSilnik()
    {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }
}
