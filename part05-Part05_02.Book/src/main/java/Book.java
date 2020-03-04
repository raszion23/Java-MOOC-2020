/**
 * File: Book.java
 * Author: Anthony Francis
 * Date: Feb 28, 2020
 * Purpose:
 */


public class Book {
    private String author;
    private String title;
    private int pages;
    
    public Book(String writer, String bookTitle, int numberOfPages) {
        this.author = writer;
        this.title = bookTitle;
        this.pages = numberOfPages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }

}
