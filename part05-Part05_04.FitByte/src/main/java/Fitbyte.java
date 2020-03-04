
/**
 * File: Fitbyte.java
 * Author: Anthony Francis
 * Date: Feb 28, 2020
 * Purpose:
 */

public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int initialAge, int initialRestingHeartRate) {
        this.age = initialAge;
        this.restingHeartRate = initialRestingHeartRate;
    }

    public double targetHeartRate(double precentageOfMaximumHeartRate) {
        double maxHeartRate = 206.3 - (0.711 * this.age);

        double targetHeartRate = ((maxHeartRate - this.restingHeartRate) * (precentageOfMaximumHeartRate) + this.restingHeartRate);
        
        return targetHeartRate;
    }

}
