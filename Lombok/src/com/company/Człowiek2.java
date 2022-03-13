package com.company;

import java.util.Objects;

public class Człowiek2 {
    String Imie;
    String Nazwisko;
    int Pesel;
    float Wzrost;
    String KolorWłosów;
    String Sylwetka;
    float StanKonta;

    public Człowiek2() {
    }

    public Człowiek2(String imie, String nazwisko, int pesel, float wzrost, String kolorWłosów, String sylwetka, float stanKonta) {
        Imie = imie;
        Nazwisko = nazwisko;
        Pesel = pesel;
        Wzrost = wzrost;
        KolorWłosów = kolorWłosów;
        Sylwetka = sylwetka;
        StanKonta = stanKonta;
    }

    public Człowiek2(String imie, String nazwisko, int pesel) {
        Imie = imie;
        Nazwisko = nazwisko;
        Pesel = pesel;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getPesel() {
        return Pesel;
    }

    public void setPesel(int pesel) {
        Pesel = pesel;
    }

    public float getWzrost() {
        return Wzrost;
    }

    public void setWzrost(float wzrost) {
        Wzrost = wzrost;
    }

    public String getKolorWłosów() {
        return KolorWłosów;
    }

    public void setKolorWłosów(String kolorWłosów) {
        KolorWłosów = kolorWłosów;
    }

    public String getSylwetka() {
        return Sylwetka;
    }

    public void setSylwetka(String sylwetka) {
        Sylwetka = sylwetka;
    }

    public float getStanKonta() {
        return StanKonta;
    }

    public void setStanKonta(float stanKonta) {
        StanKonta = stanKonta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Człowiek2 człowiek2 = (Człowiek2) o;
        return Pesel == człowiek2.Pesel && Float.compare(człowiek2.Wzrost, Wzrost) == 0 && Float.compare(człowiek2.StanKonta, StanKonta) == 0 && Objects.equals(Imie, człowiek2.Imie) && Objects.equals(Nazwisko, człowiek2.Nazwisko) && Objects.equals(KolorWłosów, człowiek2.KolorWłosów) && Objects.equals(Sylwetka, człowiek2.Sylwetka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Imie, Nazwisko, Pesel, Wzrost, KolorWłosów, Sylwetka, StanKonta);
    }

    @Override
    public String toString() {
        return "Człowiek2{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Pesel=" + Pesel +
                ", Wzrost=" + Wzrost +
                ", KolorWłosów='" + KolorWłosów + '\'' +
                ", Sylwetka='" + Sylwetka + '\'' +
                ", StanKonta=" + StanKonta +
                '}';
    }
}
