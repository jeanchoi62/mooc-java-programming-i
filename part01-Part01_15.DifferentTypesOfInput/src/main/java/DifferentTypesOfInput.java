
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String message = scanner.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubz = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean booboo = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + doubz);
        System.out.println("You gave the boolean " + booboo);
        
      
        

    }
}
