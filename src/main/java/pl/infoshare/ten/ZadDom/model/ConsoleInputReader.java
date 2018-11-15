package pl.infoshare.ten.ZadDom.model;

import java.util.Scanner;

public class ConsoleInputReader {

    public String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getFieldFromUserInput(String field) {
        System.out.print("Provide " + field + ": " );
        return readUserInput();
    }
}
