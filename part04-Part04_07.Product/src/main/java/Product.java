/**
 * File: Product.java
 * Author: Anthony Francis
 * Date: Feb 19, 2020
 * Purpose:
 */


public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + "pcs" );
    }
}
