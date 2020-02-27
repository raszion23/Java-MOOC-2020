
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        double avg;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                counter += 1;
                sum += input;
            }
        }
        avg = (double) sum / counter;
        System.out.println("Average of the numbers: " + avg);
    }
}
