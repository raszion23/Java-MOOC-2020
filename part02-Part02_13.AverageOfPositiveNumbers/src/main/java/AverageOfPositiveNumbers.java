
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        double avg;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                if (counter == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            } else if (input > 0) {
                counter += 1;
                sum += input;
            }
        }
        avg = (double) sum / counter;
        System.out.println(avg);
    }
}
