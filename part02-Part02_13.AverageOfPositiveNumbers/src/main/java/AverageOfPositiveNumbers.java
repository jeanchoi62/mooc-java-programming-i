
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int positivecontrol = 10;
        
        while (true) {
        	System.out.println("Give a number:");
        	int number = Integer.valueOf(scanner.nextLine());
        	
        	if (number > 0) {
        		count = count + 1;
        		sum = sum + number;
        		continue;
        	} else if (number < 0) {
        		continue;
        	} else if (sum == 0) {
        		System.out.println("Cannot Calculate");
        		break;
        	} else if (number == 0) {
        		System.out.println(1.00 * sum/count);
        		break;
        	}
        }
    }
}