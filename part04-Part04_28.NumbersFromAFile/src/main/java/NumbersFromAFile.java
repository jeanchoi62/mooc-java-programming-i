import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("File?");
		String file = scanner.nextLine();
		System.out.println("Lower bound?");
		int lowerBound = scanner.nextInt();
		System.out.println("Upper bound?");
		int upperBound = scanner.nextInt();
		int count = 0;
		
		try (Scanner filescanner = new Scanner(Paths.get(file))) {
			while(filescanner.hasNextLine()) {
				list.add(filescanner.nextLine());
			}
			
		} catch (Exception e) {
		}
		//NOT list[0]
		for (int i = 0; i < list.size(); i++)
			if (Integer.valueOf(list.get(i)) >= lowerBound && Integer.valueOf(list.get(i)) <= upperBound) {
				count++;
			}
			else {
				continue;
			}

		System.out.println("Numbers: " + count);

		
	}

}