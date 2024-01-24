import java.util.*;
import java.io.File;
import java.nio.file.Paths;

public class RecipeManager {
	ArrayList<String> list;
	ArrayList<String> recipeList;
	ArrayList<String> nameAndCookingTimeList;
	

	
	public RecipeManager(String file) {
		this.list = new ArrayList<>();
		this.recipeList = new ArrayList<>();
		this.nameAndCookingTimeList = new ArrayList<>();

		
		try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                this.list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		
		String recipeParts = "";
		for (int i = 0; i <this.list.size(); i++) {
			recipeParts += this.list.get(i) + ",";
				
			if (this.list.get(i).isEmpty()) {
				this.recipeList.add(recipeParts);
				recipeParts = "";
				continue;
			}
			
			if (i == this.list.size()-1) {
				this.recipeList.add(recipeParts);
				break;
			}
			
			
		}
	}
	
	//find ingredient method
	public void findIngredient(String ingredient) {
		System.out.println("Recipes: ");
		for (int i = 0; i < this.recipeList.size(); i++) {
			//split the first string into a new list
			String[] stringParts = this.recipeList.get(i).split(",");
			//iterate through the new string parts list
			for (int j  = 0; j < stringParts.length; j++) {
				if (stringParts[j].equalsIgnoreCase(ingredient)) {
					System.out.println(stringParts[0] + ", cooking time: " + stringParts[1]);
				}
			}
		}
	}
	
	
	// list method that just returns the name of the recipes and cooking time
	public void listRecipes() {
		System.out.println("\nRecipes:");
		for (int i = 0; i < this.recipeList.size(); i++) {
			//split the first string into a new list
			String[] stringParts = this.recipeList.get(i).split(",");
			//iterate through the new string parts list
			for (int j  = 0; j < 1; j++) {
				System.out.println(stringParts[0] + ", cooking time: " + stringParts[1]);
			}
		}
	}
	
	
	//find name method
	public void findName(String searchedWord) {
		for (int i = 0; i < this.recipeList.size(); i++) {
			//split the first string into a new list
			String[] stringParts = this.recipeList.get(i).split(",");
			//iterate through the new string parts list
			for (int j  = 0; j < 1; j++) {
				if (stringParts[0].contains(searchedWord)) {
					System.out.println(stringParts[0] + ", cooking time: " + stringParts[1]);
				}
			}
		}
	}
	
	//return recipes equal to or under maxTime
	public void findCookingTime(int maxTime) {
		for (int i = 0; i < this.recipeList.size(); i++) {
			//split the first string into a new list
			String[] stringParts = this.recipeList.get(i).split(",");
			//iterate through the new string parts list
			for (int j  = 0; j < 1; j++) {
				int time = Integer.valueOf(stringParts[1]);
				if (time <= maxTime) {
					System.out.println(stringParts[0] + ", cooking time: " + stringParts[1]);
				}
			}
		}
	}

}