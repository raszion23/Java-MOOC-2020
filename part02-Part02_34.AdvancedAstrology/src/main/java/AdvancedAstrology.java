
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int j = height - 1;
        for (int i = 1; i <= height * 2; i += 2) {
            printSpaces(j);
            printStars(i);
            j--;
        }

        int counter = 0;
        while (counter < 2) {
            printSpaces(height - 2);
            printStars(3);
            counter++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        christmasTree(10);
        //System.out.println("---");
        //christmasTree(10);
    }
}
