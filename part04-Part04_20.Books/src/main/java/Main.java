import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.println("Title: ");
        	String title = scanner.nextLine();
        	if (title.isEmpty()) {
        		break;
        	}
        	
        	System.out.println("Pages: ");
        	int pagess = Integer.valueOf(scanner.nextLine());
        	System.out.println("Publication year: ");
        	int yearr = Integer.valueOf(scanner.nextLine());
        	list.add(new Book(title, pagess, yearr));
        }
        
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        
        for (Book something : list) {
        	if (input.equals("everything")) {
        		System.out.println(something.toString());
        	}
        	if (input.equals("name")) {
        		System.out.println(something.getTitle());
        	}
        }
    }
}