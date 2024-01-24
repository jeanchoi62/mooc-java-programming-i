import java.util.*;
public class mainProgram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<birdManager> list = new ArrayList<>();
		birdManager fakeBird = new birdManager("fake", "bird");
		
		while(true) {
			
			System.out.println("?");
			String input = scanner.nextLine();
			
			if (input.equals("Add")) {
				System.out.println("Name: ");
				String name = scanner.nextLine();
				System.out.println("Name in Latin: ");
				String latinName = scanner.nextLine();
				//create new bird
				birdManager bird = new birdManager(name, latinName);
				list.add(bird);
			}
			
			if (input.equals("Observation")) {
				//System.out.println("Bird?");
				String birdInput = scanner.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(birdInput)) {
					list.get(i).Observation();
					}
				}
			}
			
			if (input.equals("One")) {
				System.out.println("Bird?");
				String birdInput = scanner.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(birdInput)) {
						System.out.println(list.get(i));
						break;
					}
				}
			}
			
			if (input.equals("All")) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
			
			if (input.equals("Quit")) {
				return;
			}
			
		}
		
	}

}