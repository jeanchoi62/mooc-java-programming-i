import java.util.*;


public class UserInterface {
	public static ArrayList<Integer> completeList;
	public int completeListTotal;
	public static ArrayList<Integer> passingList;
	public int passingListTotal;
	
	public UserInterface() {
		this.completeList = new ArrayList();
		this.passingList = new ArrayList();
		
	}
	
//	public double passPercentage() {
//		return 100 * passingList.size() / completeList.size();
//
//	}
//	
//	public String averagePassingPoints() {
//		
//		if (passingList.size() == 0) {
//			return "-";
//		} else {
//			double averagePassingPoints = passingListTotal / passingList.size();
//			return averagePassingPoints + " ";
//		}
//	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter point totals, -1 stops:");
		while (true) {
			
			int input = Integer.valueOf(scanner.nextLine());
			
			if (input == -1) {
				break;
			}
			
			else if (input > 0 && input <= 100) {
				if (input >= 50 && input <= 100) {
					this.passingList.add(input);
					this.passingListTotal += input;
					this.completeList.add(input);
					this.completeListTotal += input;
				}
				else {
					this.completeList.add(input);
					this.completeListTotal += input;
				}
			}
			
			else {
				continue;
			}
		}
		
		
		
		System.out.println("Point average(all): " + Double.valueOf(completeListTotal) / Double.valueOf(completeList.size()));
		//System.out.println("Point average(passing):" + averagePassingPoints());
		//System.out.println("Pass percentage: " + passPercentage());
	}

}

