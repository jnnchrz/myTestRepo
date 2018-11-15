package pl.infoshare.ten.ZadDom.model;

import java.util.ArrayList;

public class Zajecia {

    private String nazwaZajec;
    private int numerSali;
    private Wykladowca prowadzacy;
    private ArrayList<Student> studenciNaZajeciach;

    public Zajecia(String nazwaZajec, int numerSali) {
        this.nazwaZajec = nazwaZajec;
        this.numerSali = numerSali;
    }

    public String getNazwaZajec() {
        return nazwaZajec;
    }

    public int getNumerSali() {
        return numerSali;
    }

    public Wykladowca getProwadzacy() {
        return prowadzacy;
    }

    public ArrayList<Student> getStudenciNaZajeciach() {
        return studenciNaZajeciach;
    }

    public void addStudent(Student student){
        studenciNaZajeciach.add(student);
    }

    public void addWykladowca(Wykladowca wykladowca){
        prowadzacy = wykladowca;
    }
}
