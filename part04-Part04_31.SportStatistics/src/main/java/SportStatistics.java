import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("File!s: ");
		String file = scan.nextLine();
		System.out.println("Team: ");
		String team = scan.nextLine();
		int count = 0;
		int winsOne = 0;
		int lossesOne = 0;
		int winsTwo = 0;
		int lossesTwo = 0;
		
		try(Scanner reader = new Scanner(Paths.get(file))) {
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] parts = line.split(",");
				String homeTeam = parts[0];
				String visitingTeam = parts[1];
				int homeTeamPoints = Integer.valueOf(parts[2]);
				int visitingTeamPoints = Integer.valueOf(parts[3]);
				
				if (line.contains(team)) {
					count++;
				}
				
				if (parts[0].equals(team) && homeTeamPoints > visitingTeamPoints) {
					winsOne++;
				} else if (parts[0].equals(team) && homeTeamPoints < visitingTeamPoints){
					lossesOne++;
				}

				
				if (parts[1].equals(team) && visitingTeamPoints > homeTeamPoints) {
					winsTwo++;
				} else if (parts[1].equals(team) && visitingTeamPoints < homeTeamPoints){
					lossesTwo++;
				}
				

				
				
			}
			
			int wins = winsOne + winsTwo;
			int losses = lossesOne + lossesTwo;

			System.out.println("Games: " + count);
			System.out.println("Wins: " + wins);
			System.out.println("Losses: " + losses);
		}
		
		catch(Exception e) {
			
		}
	}

}