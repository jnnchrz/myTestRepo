package pl.infoshare.ten.ZadDom.model;

import java.time.LocalDate;

public class Osoba {

    private String imie;
    private String nazwisko;
    private LocalDate dataurodzenia;
    private char sex;

    public Osoba(LocalDate dataurodzenia, char sex) {
        this.dataurodzenia = dataurodzenia;
        this.sex = sex;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataurodzenia() {
        return dataurodzenia;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Imie: " + imie +
                "\nNazwisko" + nazwisko +
                "\nData urodzenia: " + dataurodzenia +
                "\nPlec: " + sex + "\n";
    }
}
}
