package pl.infoshare.ten.ZadDom.model;

import java.io.IOException;

public class Menu {
    private ConsoleInputReader consoleInputReader;
    private InputHandler inputHandler;
    private UserService userService;

    public MenuService() {
        consoleInputReader = new ConsoleInputReader();
        inputHandler = new InputHandler();
        userService = new UserService();
    }

    /*
      Metoda rozpoczynajaca program
     */
    public void start() throws IOException {
        //Wywolanie metody wyswietlajacej menu
        printMenu();

        //Wczytanie wyboru uzytkownika
        String userChoice = consoleInputReader.readUserInput();

        //Wywolaj metode do obslugi wyboru uzytkownika i przekaz pobrany z klawiatury wybor
        inputHandler.handleUserChoice(userChoice);
    }

    /*
  Metoda ktora wyswietla menu
 */
    private void printMenu() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---- MENU ----");
        System.out.println("1.\t Stworz zajecia");
        System.out.println("2.\t Wyświetl uzytkowników.");
        System.out.println("3.\t Wyświetl uzytkowników.");
        System.out.println();
        System.out.println("0.\t Wyjdz z programu.");
        System.out.print("Wybor: ");
    }

    /*
    Metoda odpowiadajaca za zapytanie uzytkownika, czy chce dodac kolejnego usera
   */
    public void shouldAddAnotherUser() throws IOException {
        System.out.println("Do you want to add another one? [Y/N]");
        String input = consoleInputReader.readUserInput();
        if (input.equals("Y")) {
            userService.createNewUser();
        } else if (input.equals("N")) {
            start();
        } else {
            System.out.println("Wrong input!");
            shouldAddAnotherUser();
        }
    }

    /*
  Metoda do wypisywania informacji o poprawnie wykonanej operacji
 */
    public void printSuccess() {
        System.out.println("WYKONANO POPRAWNIE!");
    }

    /*
      Metoda do wypisywania informacji o zle wykonanej operacji
     */
    public void printError() {
        System.out.println("BLAD! Zly wybor. Zrestartuj program");
    }
}
