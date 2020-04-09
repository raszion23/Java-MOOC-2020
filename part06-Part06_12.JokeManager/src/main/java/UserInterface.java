
/**
 * File: UserInterface.java
 * Author: Anthony Francis
 * Date: Apr 9, 2020
 * Purpose:
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.manager = jokes;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);
            }

            if (command.equals("2")) {
                System.out.println(this.manager.drawJoke());
            }
            
            if (command.equals("3")) {
                this.manager.printJokes();
                
            }
        }

    }
}
