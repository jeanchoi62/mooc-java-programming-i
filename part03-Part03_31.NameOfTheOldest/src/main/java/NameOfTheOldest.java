
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int oldest = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            count ++;
            
            if (input.equals("")) {
                break;
            }
            
            for (int i = 0; i<count; i++) {
                if (Integer.valueOf(pieces[1]) > oldest) {
                    oldest = Integer.valueOf(pieces[1]);
                    name = pieces[0];
                }
            }   
        }
        System.out.println(name);
    }
}
