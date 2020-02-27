
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");

            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldest = age;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
