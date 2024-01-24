
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int one = 1;
        
        while (one <= number) {
            System.out.print("*");
            one++;
        }
        System.out.println("");
        
    }

    public static void printSquare(int size) {
        int count = 1;
        while (count <= size) {
            printStars(size);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int start = 1;
        while (start  <= height) {
            printStars(width);
            start++;
        }
    }

    public static void printTriangle(int size) {
        int start = 1; 
        while (start <= size) {
            printStars(start);
            start++;
        }
    }
}
