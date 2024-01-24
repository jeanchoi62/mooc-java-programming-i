import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String input = scanner.nextLine();
        RecipeManager test = new RecipeManager(input);
        System.out.println("Commands: " 
        			+ "\nlist - lists the recipes" 
        			+ "\nstop - stops the program"
        			+ "\nfind name - searches recipes by name"
        			+ "\nfind cooking time - searches recipes by cooking time"
        			+ "\nfind ingredient  - searches recipes by ingredient");
        			
        
        while (true) {
        	System.out.println("\nEnter command: ");
        	String command = scanner.nextLine();
            
            if (command.equals("stop")) {
            	return;
            } else if(command.equals("list")) {
            	test.listRecipes();
            } else if(command.equals("find name")) {
            	System.out.println("Searched word: ");
            	//conflicts with parameter in RecipeManager class?
            	String searchedWord = scanner.nextLine();
            	test.findName(searchedWord);
            } else if(command.equals("find cooking time")) {
            	System.out.println("Max cooking time: ");
            	int maxCookingTime = Integer.valueOf(scanner.nextLine());
            	test.findCookingTime(maxCookingTime);
            
            } else if(command.equals("find ingredient")) {
            	System.out.println("Ingredient: ");
            	String ingredient = scanner.nextLine();
            	test.findIngredient(ingredient);
            }
            
        }
 
    }

}