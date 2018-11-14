package pl.infoshare.ten.ZadDom.model;

import java.time.LocalDate;

public class Wykladowca extends Osoba {

    public String tytulNaukowy;

    public Wykladowca(LocalDate dataurodzenia, char sex, String tytulNaukowy) {
        super(dataurodzenia, sex);
        this.tytulNaukowy = tytulNaukowy;
    }


    public String getTytul() {
        return tytulNaukowy;
    }

    public void setTytul(String tytul) {
        this.tytulNaukowy = tytul;
    }

    @Override
    public String toString() {
        return super.toString() + "Tytul naukowy: " + tytulNaukowy;
    }
}
