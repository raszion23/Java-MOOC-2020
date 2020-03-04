
/**
 * File: Cube.java
 * Author: Anthony Francis
 * Date: Feb 28, 2020
 * Purpose:
 */

public class Cube {

    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        int volume = this.length * this.length * this.length;

        return volume;
    }

    public String toString() {
        return "The length of thge edge is " + this.length + " and the volume " + this.volume();
    }

}
