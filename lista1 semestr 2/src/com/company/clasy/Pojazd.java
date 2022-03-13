package com.company.clasy;

// kiedy klasa jest prywatna to nie można dostać się przykładowo do jego metod
/* Kiedy modyfikator klasy jest pusty to interpreter ustawia na protected czyli każda klasa dziedzicząsa nie ma dostępu
 do tej klasy bo znajdują się w innym package a private pozwala tylko w tym samym katalogu(package)*/
/*private*/ public class Pojazd {
    int RokProdukcji;
    String rodzajSilnika;
    String kolor;
    String masa;

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, String masa) {
        RokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public Pojazd() {
    }

    public int getRokProdukcji() {
        return RokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public String getMasa() {
        return masa;
    }

    public void setRokProdukcji(int rokProdukcji) {
        RokProdukcji = rokProdukcji;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void uruchomSilnik(){
        System.out.println("Silnik Uruchomiono");
    }
}
