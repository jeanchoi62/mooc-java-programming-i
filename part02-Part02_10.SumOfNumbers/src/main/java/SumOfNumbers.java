
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number != 0) {
                total = total + number;
                continue;
            } else if (number == 0) {
                System.out.println("Sum of the numbers: " + total);
                break;
            }
        }

    }
}
