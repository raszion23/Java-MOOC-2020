
/**
 * File: UserInterface.java
 * Author: Anthony Francis
 * Date: Apr 7, 2020
 * Purpose:
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                this.list.add(this.scanner.nextLine());
            }

            if (command.equals("list")) {
                this.list.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed: ");
                this.list.remove(this.scanner.nextInt());
            }

        }
    }

}
