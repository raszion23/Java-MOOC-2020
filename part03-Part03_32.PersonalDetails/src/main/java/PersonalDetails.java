
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");

            String name = pieces[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            int age = Integer.valueOf(pieces[1]);
            sum += age;
            count++;
        }
        double avg = (double) sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
