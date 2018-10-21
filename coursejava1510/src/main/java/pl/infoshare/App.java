package pl.infoshare;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
         /*
        ZADANIE DOMOWE 15.10 GRA LOTTO
         */

        int[] numbers = IntStream.rangeClosed(1, 49).toArray();

        int count = 0;
        int[] winning_numbers = new int[6];
        int[] chosen_numbers = new int[6];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (count <6){
            System.out.print("Podaj liczbe od 1 do 49: ");
            int chosen_number = scanner.nextInt();

            if (IntStream.of(chosen_numbers).anyMatch(x -> x == chosen_number)){
                System.out.println("Juz podales ta liczbe. Wybierz inna.");
            }
            else if (chosen_number < 1 || chosen_number > 49){
                System.out.println("Podales liczbe spoza przedzialu. Wybierz inna.");
            }
            else {
                chosen_numbers[count] = chosen_number;
                count++;
            }

        }
        System.out.print("Wylosowane liczby: ");
        count = 0;
        while (count < 6){

            int index = random.nextInt(numbers.length);
            int winning_number = numbers[index];

            if (!IntStream.of(winning_numbers).anyMatch(x -> x == winning_number)){
                winning_numbers[count] = winning_number;
                System.out.print(winning_number + " ");
                count++;
            }

        }

        if(chosen_numbers == winning_numbers){
            System.out.println("Jestes milionerem!");
        }
        else{
            System.out.println("Nie trafiles! :(");
        }

    }
}