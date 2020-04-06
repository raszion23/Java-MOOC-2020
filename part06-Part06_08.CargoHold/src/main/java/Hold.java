
/**
 * File: Hold.java
 * Author: Anthony Francis
 * Date: Apr 6, 2020
 * Purpose:
 */
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> list;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.list = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;

        for (Suitcase luggage : this.list) {
            total += luggage.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (!(totalWeight() + suitcase.totalWeight() > this.maxWeight)) {
            this.list.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcases : this.list) {
            suitcases.printItems();
        }
    }

    public String toString() {
        if (list.isEmpty()) {
            return "No items " + "(" + totalWeight() + "kg)";
        } else {
            return list.size() + " suitcases (" + this.totalWeight() + ")kg";
        }
    }
}
