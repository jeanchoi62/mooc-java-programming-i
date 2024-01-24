
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] list = input.split(" ");
            if (input.equals("quit")) {
                break;
            }
            
            if (input.contains("add")) {
            	String[] parts = input.split(" ");
            	int addAmount = Integer.valueOf(parts[1]);
            	
            	if (addAmount < 0) {
            		first = first;
            	}
            	else if (first + addAmount <= 100) {
            		first += addAmount;
            	}
            	//anything added past 100 will go to waste
            	else {
            		first = 100;
            	}
            }
            
            if (list[0].equals("move")) {
            	String[] parts = input.split(" ");
            	int moveAmount = Integer.valueOf(parts[1]);
            	
            	if (moveAmount < 0) {
            		first = first;
            		second = second;
            	} else if (moveAmount > first) {
            		second += first;
            		first = 0;
            	} else if (moveAmount + second > 100) {
            		second = 100;
            		first -= moveAmount;
            	} else {
            		first -= moveAmount;
            		second += moveAmount;
            	}
            }
            
            if (list[0].equals("remove")) {
            	String[] parts = input.split(" ");
            	int removeAmount = Integer.valueOf(parts[1]);
            	if (removeAmount > second) {
            		second = 0;
            	} else {
            		second -= removeAmount;
            	} 
            }

        }
    }

}