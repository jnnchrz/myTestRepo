package pl.infoshare.ten.ZadDom.model;

import pl.infoshare.ten.ZadDom.model.Osoba;

import java.time.LocalDate;

public class Student extends Osoba {

    public int numerIndeksu;

    public Student(LocalDate dataurodzenia, char sex, int numerIndeksu) {
        super(dataurodzenia, sex);
        this.numerIndeksu = numerIndeksu;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public String toString() {
        return super.toString() + "Numer indeksu: " + numerIndeksu + "\n";
    }
}
