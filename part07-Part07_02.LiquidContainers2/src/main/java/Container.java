
/**
 * File: Container.java
 * Author: Anthony Francis
 * Date: Apr 21, 2020
 * Purpose:
 */

public class Container {

    private int liter;

    public Container() {

    }

    public int contains() {
        return this.liter;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liter += amount;
        }

        if (amount > 100) {
            this.liter = 100;
        }

        if (this.liter > 100) {
            this.liter = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liter -= amount;
        }

        if (this.liter < 0) {
            this.liter = 0;
        }
    }

    public String toString() {
        return this.liter + "/100";
    }

}
