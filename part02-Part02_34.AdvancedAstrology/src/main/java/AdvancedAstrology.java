
public class AdvancedAstrology {

    public static void printStars(int number) {
        int one = 1;
        
        while (one <= number) {
            System.out.print("*");
            one++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int one = 1;
        while (one <= number) {
            System.out.print(" ");
            one++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        
        while (count <= size) {
            printSpaces(size - count);
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        int count = 1; 
        int stars = 1;
        
        while (count <= height) {
            printSpaces(height - count);
            printStars(stars);
            count++;
            stars += 2;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
