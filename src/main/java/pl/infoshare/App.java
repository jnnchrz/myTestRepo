package pl.infoshare;
//import pl.infoshare.Cat;

/* Zadanie 1 31.10.2018*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Provide Username: ");
        String username = readUserInput();

        System.out.print("Provide Password: ");
        String password = readUserInput();

        User user = new User(username, password);
        System.out.println("Stworzono uzytkownika " + user.getUsername() + "\t\t" + "O hasle: " + user.getPassword());

    }

    private static String readUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();


//    pl.infoshare.Calculator calculator = new pl.infoshare.Calculator();
//
////    {
////        System.out.println(calculator.add(5, 5));
////        System.out.println(calculator.substract(5, 5));
////        System.out.println(calculator.multiply(5, 5));
////        System.out.println(calculator.divide(5, 5));
////
////
////    }
//    public static void main (String[] args){
//        System.out.println(;);
//
//    }
//
//
//    public static void changeabc (abc){
//        System.out.println( =changeabc();+= "X");
//    }
//
//        {
//            Cat cat = new Cat;
//
//            System.out.println(cat.numberofLegs);
//            System.out.println(cat.);
//
//            Dog dog = new Dog;
//        }
    }
}