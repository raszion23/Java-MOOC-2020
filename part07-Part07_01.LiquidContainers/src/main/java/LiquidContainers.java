
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxLimit = 100;
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + ("/100"));
            System.out.println("Second: " + secondContainer + ("/100"));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");

            String command = parts[0];
            int liters = Integer.valueOf(parts[1]);

            if (command.equals("add")) {

                if (!(liters < 0) && liters < maxLimit) {
                    firstContainer += liters;
                }

                if (liters >= maxLimit || firstContainer >= maxLimit) {
                    firstContainer = maxLimit;
                }

                System.out.println("");
            }

            if (command.equals("move")) {

                if (liters < 0) {
                    liters = 0;
                }

                if (liters > maxLimit) {
                    liters = maxLimit;
                }

                if (liters > firstContainer) {
                    liters = firstContainer;
                }

                secondContainer += liters;
                firstContainer -= liters;

                if (secondContainer > maxLimit) {
                    secondContainer = maxLimit;
                }

                System.out.println("");
            }

            if (command.equals("remove")) {

                if (liters > 0 && liters < maxLimit) {
                    secondContainer -= liters;
                }

                if (secondContainer < 0) {
                    secondContainer = 0;
                }

                System.out.println("");
            }

        }
    }

}
