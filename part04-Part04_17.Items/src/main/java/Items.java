import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                items.add(new Item(input));
            }
        }
        
        for (Item itekkkm : items) {
            System.out.println(itekkkm.toString());
        }
  
    

    }
}
