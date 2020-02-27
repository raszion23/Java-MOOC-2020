
/**
 * File: NewClass.java
 * Author: Anthony Francis
 * Date: Feb 19, 2020
 * Purpose:
 */

public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    
    public void sound() {
        System.out.println(this.sound);
    }
}
