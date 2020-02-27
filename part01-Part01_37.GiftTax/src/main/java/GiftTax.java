
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of gift?");
        int value = Integer.valueOf(scan.nextLine());
        double giftTax;
        
        if (value < 5000) {
            System.out.println("No Tax!");
        } else if (value >= 5000 && value < 25000) {
            giftTax = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + giftTax);
        } else if (value >= 25000 && value < 55000) {
            giftTax = (1700 + (value - 25000) * 0.10);
            System.out.println("Tax: " + giftTax);
        } else if (value >= 55000 && value < 200000) {
            giftTax = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: " + giftTax);
        } else if (value >= 200000 && value < 1000000) {
            giftTax = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: " + giftTax);
        } else if (value >= 1000000) {
            giftTax = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + giftTax);
        }

    }
}
