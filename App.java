package pl.infoshare;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static <Print> void main(String[] args) throws IOException {
        //ZADANIE 1 z 22.10
//   String[] array = {"Asia", "Ania", "Kasia", "Karol", "Tomek"};
//        System.out.println(array);
//        for (String imie:
//        array){
//            System.out.println(imie);
//        }
//        PrintWriter write = new PrintWriter("pliktesktowy.txt");
//        for (String name:
//        write.println(name);
//        write.close();
//             ) {
//
//        }
//        //ZADANIE2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj swoje imie i nazwisko: ");
//        String name = scanner.nextLine();
//        PrintWriter write = new PrintWriter("ZAD2.txt");
//        write.println(name);
//        write.close();
//
//        //ZADANIE3
//        Random random = new Random();
//        int[] losowanie1 = new int[100];
//        int[] losowanie2 = new int[100];
//
//        for (int i = 0; i < losowanie1.length; i++) {
//            losowanie1[i] = random.nextInt(100) + 1;
//            losowanie2[i] = random.nextInt(100) + 1;
//        }
//        PrintWriter pwLos1 = new PrintWriter("./ZAD3_1.txt");
//        PrintWriter pwLos2 = new PrintWriter("./ZAD3_2.txt");
//        for (int i = 0; i < losowanie1.length; i++) {
//            pwLos1.append((random.nextInt(100) + 1) + "\n");
//            pwLos2.append((random.nextInt(100) + 1) + "\n");
//        }
//        pwLos1.close();
//        pwLos2.close();
//
//        List<String> listLos1 = Files.readAllLines(Paths.get("./ZAD3_1.txt"));
//        List<String> listLos2 = Files.readAllLines(Paths.get("./ZAD3_2.txt"));
//
//        int hits = 0;
//        for (String elementLos1 : listLos1) {
//            for (String elementLos2 : listLos2) {
//                if (Integer.parseInt(elementLos1) == Integer.parseInt(elementLos2)) {
//                    hits++;
//                }
//            }
//        }
//        System.out.println("Tych samych liczb: " + hits);
//
        //ZADANIE 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoj tekst: ");
        String text = scanner.nextLine();

        PrintWriter reverse = new PrintWriter("ZAD4.txt");
        reverse.print(new StringBuilder(text).reverse().toString());
reverse.close();
    }
}

