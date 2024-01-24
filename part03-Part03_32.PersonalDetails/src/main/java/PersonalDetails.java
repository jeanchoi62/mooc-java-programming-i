import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        double sum = 0;
        double count = 0;
        double average = 0;
        double longest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            
            
            
            if (input.equals("")) {
                break;
            }
            count++;
            sum = sum + Integer.valueOf(pieces[1]);
            
            for (int i = 0; i<count; i++) {
                
                if (pieces[0].length() > longest) {
                    longest = pieces[0].length();
                    name = pieces[0];
                    
                    
                }
            }
        }
        average = sum/count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
