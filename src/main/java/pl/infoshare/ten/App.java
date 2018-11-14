package pl.infoshare.ten;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        // Zadanie 1

        Zwierze pies = new Pies();
        Zwierze duck = new Duck();


        //Zadanie 2

        Zwierze kot = new Zwierze() {
            @Override
            public String voice() {
                return "Miau Miau";
            }
        };


        System.out.println("Pies: " + pies.voice());
        System.out.println("Duck: " + duck.voice());
        System.out.println("Cat: " + kot.voice());

        ArrayList<Zwierze> list = new MojaLista<>();
        list.add(pies);
        list.add(duck);
        list.add(kot);
        System.out.println(list.get(0).voice());
        System.out.println(list.get(1).voice());
        System.out.println(list.get(2).voice());

    }
}

