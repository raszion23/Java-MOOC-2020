
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        Scanner scan = new Scanner(System.in);

        int maxLimit = 100;

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");

            String command = parts[0];
            int liters = Integer.valueOf(parts[1]);

            if (command.equals("add")) {

                if (!(liters < 0) && liters < maxLimit) {
                    firstContainer.add(liters);
                }

                if (liters >= maxLimit || firstContainer.contains() >= maxLimit) {
                    firstContainer.add(maxLimit);
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

                if (liters > firstContainer.contains()) {
                    liters = firstContainer.contains();
                }

                secondContainer.add(liters);
                firstContainer.remove(liters);

                if (secondContainer.contains() > maxLimit) {
                    secondContainer.add(maxLimit);
                }

                System.out.println("");
            }

            if (command.equals("remove")) {

                if (liters > 0 && liters < maxLimit) {
                    secondContainer.remove(liters);
                }

                if (secondContainer.contains() < 0) {
                    secondContainer.remove(0);
                }

                System.out.println("");
            }

        }
    }

}
