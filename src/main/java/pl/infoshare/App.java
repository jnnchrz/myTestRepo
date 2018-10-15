package pl.infoshare;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //ZADANIE 1 15.10
int [] array = new int [11];
Random random = new Random();
int randomInt = random.nextInt(100) + 1;
for (int i = 0; i < array.length ; i++) {
    array[i] = random.nextInt(100) + 1;
}
for(int i = 0; i < array.length; i++) {
if (i % 2 != 0) System.out.println("Index no. " + i + "\tvalue " + array[i]);
}


for(int i = 0; i <= 10 ; i ++) {
    System.out.println(i);

//


// ZADANIE 3 15.10
        int winningNumber = new Random().nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbe od 1 do 10: ");
            int userNumber = scanner.nextInt();
            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Podales liczbe z innego przedzialu!");
            }
            if (userNumber == winningNumber) System.out.println("WYGRALES!");
            break;
        }
            else System.out.println("GRAJ DALEJ :-(");
        }
    }
}

