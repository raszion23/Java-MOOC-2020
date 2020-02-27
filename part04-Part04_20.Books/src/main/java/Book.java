
/**
 * File: Book.java
 * Author: Anthony Francis
 * Date: Feb 25, 2020
 * Purpose:
 */

public class Book {

    private String title;
    private int numbersOfPages;
    private int publicationYear;

    public Book(String name, int pages, int year) {
        this.title = name;
        this.numbersOfPages = pages;
        this.publicationYear = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.numbersOfPages;
    }

    public int getYear() {
        return this.publicationYear;
    }

    public String toString() {
        return this.title + ", " + this.numbersOfPages + " pages, " + this.publicationYear;
    }
}
