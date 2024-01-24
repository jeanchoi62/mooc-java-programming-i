

import java.util.Scanner;

public class UserInterface {
    private final TodoList list;
    private final Scanner scanner;
    
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            
                    System.out.println("Command: ");
        String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add:"); 
                String task = scanner.nextLine();
                this.list.add(task);
            }
            
            if (command.equals("list")) {
               this.list.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("What task ID do you want to remove?");
                int task = scanner.nextInt();
                this.list.remove(task);
            }
        }
        
    }
    
}
