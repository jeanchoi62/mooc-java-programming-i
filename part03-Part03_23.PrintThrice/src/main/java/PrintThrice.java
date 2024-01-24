
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Say something: ");
        String input = scanner.nextLine();
        String three = input + input + input;
        System.out.println(three);

    }
}
