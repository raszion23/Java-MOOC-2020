
/**
 * File: Suitcase.java
 * Author: Anthony Francis
 * Date: Apr 6, 2020
 * Purpose:
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.list = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item items : this.list) {
            totalWeight += items.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {

        if (!(totalWeight() + item.getWeight() > this.maxWeight)) {
            this.list.add(item);
        }
    }

    public void printItems() {
        for (Item items : this.list) {
            System.out.println(items);
        }
    }

    public Item heaviestItem() {
        if (this.list.isEmpty()) {
            return null;
        }

        Item heaviest = this.list.get(0);

        for (Item items : this.list) {
            if (heaviest.getWeight() < items.getWeight()) {
                heaviest = items;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (list.isEmpty()) {
            return "no items " + "(" + totalWeight() + "kg)";
        } else if (list.size() == 1) {
            return "1 item " + "(" + totalWeight() + "kg)";
        } else {
            return list.size() + " items (" + totalWeight() + "kg)";
        }
    }
}
