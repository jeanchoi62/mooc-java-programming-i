import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;
    
    public UserInterface(JokeManager joke, Scanner scanner) {
        this.joke = joke;
        this.scanner = scanner;
    }
    
    public void start() {

        while (true) {
        System.out.println("What a joke!");
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        String input = scanner.nextLine();
        
        
        if (input.equals("X")) {
            return;
        }
        
        else if (input.equals("1")) {
            System.out.println("What is the joke you want to add?");
            String jokeInput = scanner.nextLine();
            joke.addJoke(jokeInput);
            continue;
        }
        
        else if(input.contains("2")) {
            System.out.println("Drawing a joke.");
            if (this.joke.emptyy()) {
            System.out.println("Jokes are in short supply.");
            } else {
                Random draw = new Random();
                System.out.println(joke.drawJoke());
            }
            continue;
        }
        
            
        else if (input.equals("3")) {
        System.out.println("Printing the jokes.");
        joke.printJokes();
        continue;
        }
        }
        }
    }
    