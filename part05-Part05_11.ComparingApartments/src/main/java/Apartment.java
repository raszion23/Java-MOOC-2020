
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int firstApartmentPrice = this.princePerSquare * this.squares;
        int secondApartmentPrice = compared.princePerSquare * compared.squares;

        int priceDifference = firstApartmentPrice - secondApartmentPrice;
        if (priceDifference < 0) {
            priceDifference = secondApartmentPrice - firstApartmentPrice;
        }

        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int firstApartmentPrice = this.princePerSquare * this.squares;
        int secondApartmentPrice = compared.princePerSquare * compared.squares;

        if (firstApartmentPrice > secondApartmentPrice) {
            return true;
        }
        return false;
    }
}
