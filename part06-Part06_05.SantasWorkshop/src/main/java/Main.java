
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and The Goblet of Fire", 2);
        
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());
        
        System.out.println("Gift: " + book);
        
        Package packages = new Package();
        packages.addGift(book);
        System.out.println(packages.totalWeight());
        
    }
}
