
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int num = Integer.valueOf(input.nextLine());
            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }

            statistics.addNumber(num);
        }

       
        System.out.println("Sum: " + statistics.sum());
        
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
    }
}
