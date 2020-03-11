
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String printOutput = " ";

        if (this.elements.isEmpty()) {
            printOutput = "The collection " + this.name + " is empty.";

            return printOutput;
        }

        if (this.elements.size() == 1) {
            printOutput = "The collection " + this.name + " has " + this.elements.size() + " element:";
        } else {
            printOutput = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        }

        String element = "";

        for (String i : this.elements) {
            element += "\n" + i;
        }

        return printOutput + element;
    }
}
