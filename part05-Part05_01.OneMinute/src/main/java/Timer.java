/**
 * File: Timer.java
 * Author: Anthony Francis
 * Date: Feb 28, 2020
 * Purpose:
 */


public class Timer {
    private int seconds;
    private int hundrethOfSecond;
    
    public Timer() {
        this.hundrethOfSecond = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundrethOfSecond++;
        
        if (this.hundrethOfSecond == 100) {
            this.hundrethOfSecond = 0;
            this.seconds++;
        }
        
        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }
    
    public String toString() {
        if (this.hundrethOfSecond < 10 && this.seconds < 10) {
            return "0" + this.seconds + ":" + "0" + this.hundrethOfSecond;
        } else if (this.seconds < 10 ) {
            return "0" + this.seconds + ":" + this.hundrethOfSecond;
        }
        
        return "" + this.seconds + ":" + this.hundrethOfSecond;
    }

}
