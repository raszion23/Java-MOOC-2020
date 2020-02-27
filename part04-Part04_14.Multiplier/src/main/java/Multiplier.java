/**
 * File: Multiplier.java
 * Author: Anthony Francis
 * Date: Feb 24, 2020
 * Purpose:
 */


public class Multiplier {
    private int number;
    
    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int number) {
        this.number = this.number * number;
        return this.number;
    }

}
