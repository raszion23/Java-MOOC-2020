
/**
 * File: Items.java
 * Author: Anthony Francis
 * Date: Mar 9, 2020
 * Purpose:
 */
public class Items {

    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Items)) {
            return false;
        }

        Items comparedItems = (Items) compared;
        return this.identifier.equals(comparedItems.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
