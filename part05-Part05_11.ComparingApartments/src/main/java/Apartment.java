
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
        if (compared.squares < this.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int difference = (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares)) {
            return true;
        } else {
            return false;
        }
    }

}
