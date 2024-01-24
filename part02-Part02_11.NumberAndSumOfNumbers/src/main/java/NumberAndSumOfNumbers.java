
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number != 0) {
                input = input + 1;
                sum = sum + number;
                continue;
            } else if (number == 0) {
                System.out.println("Number of numbers: " + input);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }

    }
}
