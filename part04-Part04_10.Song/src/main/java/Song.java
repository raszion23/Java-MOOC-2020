/**
 * File: Song.java
 * Author: Anthony Francis
 * Date: Feb 23, 2020
 * Purpose:
 */


public class Song {
    private String name;
    private int length;
    
    public Song(String initialName, int initialLength) {
        this.name = initialName;
        this.length = initialLength;
    }
    
    public String name() {
        return this.name;
    }
    
    public int length() {
        return this.length;
    }
}
