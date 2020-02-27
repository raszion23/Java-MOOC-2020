
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int convert;

        System.out.println("How many days would you like to convert to seconds?");

        int days = Integer.valueOf(scanner.nextLine());
        convert = (seconds * minutes) * (hours * days);

        System.out.println(convert);

    }
}
