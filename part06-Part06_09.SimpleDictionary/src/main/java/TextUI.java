import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dictionary;
	
	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}
	
	public void start() {
		while (true) {
		System.out.println("Command: ");
		String command = scanner.nextLine();
		
		if (command.equals("end")) {
			System.out.println("Bye bye!");
			break;
		} if (command.equals("add")) {
			System.out.println("Word: ");
			String word = scanner.nextLine();
			System.out.println("Translation: ");
			String translation = scanner.nextLine();
			dictionary.add(word, translation);
			continue;
		} if (command.equals("search")) {
                    System.out.println("To be translated: ");
                    String translate = scanner.nextLine();
                    if (dictionary.translate(translate) != null)  {
                    	System.out.println("Translation: " + dictionary.translate(translate));
                        continue;
                    } else {
                    	System.out.println("Word " + translate + " was not found");
                    }
                    continue;
                }
			System.out.println("Unknown command");
		}
	}
}