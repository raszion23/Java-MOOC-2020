
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String nameFirst = scanner.nextLine();
            if (nameFirst.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String nameLast = scanner.nextLine();

            System.out.println("Identification number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(nameFirst, nameLast, id));
        }

        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}
