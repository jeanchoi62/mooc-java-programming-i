
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        /*Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());*/
        
        
        System.out.println("Enter numbers: ");
        Statistics user = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        while (true) {
        	int input = scanner.nextInt();
        	if (input == -1) {
            System.out.println("Sum: " + user.sum());
            System.out.println("Sum of even numbers: " + even.sum());
            System.out.println("Sum of odd numbers: " + odd.sum());
            	return;
            } else if (input % 2 == 0){
            	user.addNumber(input);
            	even.addNumber(input);
            } else if (input % 2 != 0) {
                user.addNumber(input);
            	odd.addNumber(input);
            }
        
        }
    }
}

