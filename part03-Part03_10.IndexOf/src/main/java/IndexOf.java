
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int num = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i < list.size()) {
            if (num == list.get(i)) {
                System.out.println(num + " is at index " + i);
            }
            i++;
        }
    }
}

