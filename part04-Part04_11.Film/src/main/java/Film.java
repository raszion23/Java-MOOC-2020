/**
 * File: Film.java
 * Author: Anthony Francis
 * Date: Feb 24, 2020
 * Purpose:
 */


public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    public String name() {
        return this.name;
    }
    
    public int ageRating() {
        return this.ageRating;
    }

}
