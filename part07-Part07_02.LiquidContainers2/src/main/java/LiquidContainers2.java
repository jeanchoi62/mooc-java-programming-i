
import java.util.Scanner;

public class LiquidContainers2 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final Container first = new Container();
        final Container second = new Container();



        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);


            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            final String[] inputs = input.split(" ");
            final String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            
            if (command.equals("add")) {
                first.add(amount);
            }
            
            if (command.equals("move")) {
            	if (amount > first.contains()) {
            		second.add(first.contains());
            		first.remove(amount);
            	} else if (first.contains() > amount) {
            		first.remove(amount);
            		second.add(amount);
            	} else {
            		second.add(amount);
            		first.remove(amount);
            	}
            }
            
            if (command.equals("remove")) {
            	second.remove(amount);
            }
            
        }
    }
}