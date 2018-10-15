package pl.zadanie1010;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // ZADANIE 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita: ");

        double numberFromKeyboard = scanner.nextInt();

        System.out.println("Podales: " + numberFromKeyboard);


        // ZADANIE 1 DODATKOWE


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        String numberFromKeyboard = scanner.nextLine();
        Long a = Long.parseLong(numberFromKeyboard);
        System.out.println("Podales: " + a );


        // ZADANIE 2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoj wiek: ");
        byte ageFromKeyboard = scanner.nextByte();
        if (ageFromKeyboard >= 18) {
            System.out.println("Uzytkownik pelnoletni");
        } else {
            System.out.println("Uzytkownik niepelnoletni");
        }


        // ZADANIE 2 DODATKOWE

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoj wiek: ");
        byte ageFromKeyboard = scanner.nextByte();
        if(ageFromKeyboard < 0 || ageFromKeyboard > 123) {
            System.out.println("Liczba nieprawidlowa");
        } else if (ageFromKeyboard >= 18) {
            System.out.println("Uzytkownik pelnoletni.");
        } else {
            System.out.println("Uzytkownik niepelnoletni.");
        }


        // ZADANIE 3

        Scanner scanner = new Scanner(System.in);
        String login1 = "admin";
        String password1 = "haslo";
        String login2 = "user";
        String password2 = "haslohaslo";

        System.out.print("Podaj login: ");
        String enteredlogin = scanner.nextLine();

        if (enteredlogin.equals(login1)) {
            System.out.print("Podaj haslo: ");
            String enteredpassword = scanner.nextLine();
            if (enteredpassword.equals(password1)) {
                System.out.println("Zalogowales sie jako admin");
            } else {
                System.out.println("Haslo lub login nieprawidlowe!");
            }
        }
        else if (enteredlogin.equals(login2))
                System.out.print("Podaj haslo: ");
            String enteredpassword = scanner.nextLine();
            if (enteredpassword.equals(password2)) {
                System.out.println("Zalogowales sie jako user");
            } else {
                System.out.println("Haslo lub login nieprawidlowe");
            }

        }
    }