
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Second number? ");
        int second = Integer.valueOf(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
