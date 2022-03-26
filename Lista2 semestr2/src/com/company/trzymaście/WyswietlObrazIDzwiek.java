package com.company.trzymaście;

public interface WyswietlObrazIDzwiek {
    WyswietlObraz wyswietlObraz = new WyswietlObraz() {
        @Override
        public void wyswietl() {

        }
    };
    WydajeDzwięk wydajDziwiek = new WydajeDzwięk() {
        @Override
        public void graj() {

        }
    };

    public default void graj(){
        wydajDziwiek.graj();
    }

    public default void wyswietl(){
        wyswietlObraz.wyswietl();
    }
}
