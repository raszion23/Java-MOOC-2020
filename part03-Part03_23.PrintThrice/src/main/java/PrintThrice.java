
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        
        String phrase = word+word+word;
        
        System.out.println(phrase);

    }
}
