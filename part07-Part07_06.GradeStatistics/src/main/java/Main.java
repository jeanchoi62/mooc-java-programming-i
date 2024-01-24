import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // Write your program here -- consider breaking the program into 
        // multiple classes
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter point totals, -1 stops:");
    	
    	int validGradesTotal = 0;
    	int validGradesCount = 0;
    	int passingGradesTotal = 0;
    	int passingGradesCount = 0;
    	String fiveStars = "";
    	String fourStars = "";
    	String threeStars = "";
    	String twoStars = "";
    	String oneStars = "";
    	String zeroStars = "";
    	ArrayList<Integer> validList = new ArrayList();
    	ArrayList<Integer> passingList = new ArrayList();
    	
    	
    	while (true) {
    		int input = Integer.valueOf(scanner.nextLine());
    		
    		if (input == -1) {
    			break;
    		}
    		if (input >= 0 && input <= 100) {
    			validList.add(input);
    			validGradesTotal += input;
    			validGradesCount++;
    			if (input >= 90) {
    				fiveStars += '*';
    			} else if (input <= 89 && input >= 80) {
    				fourStars += '*';
    			} else if (input <= 79 && input >= 70) {
    				threeStars += '*';
    			} else if (input <= 69 && input >= 60) {
    				twoStars += '*';
    			} else if (input <= 59 && input >= 50) {
    				oneStars += '*';
    			} else if (input <50) {
    				zeroStars += '*';
    			}
	    			
    		}
    		
    		if (input >= 50 && input <= 100) {
    			passingList.add(input);
    			passingGradesTotal += input;
    			passingGradesCount++;
    		}
    	}
    	
    	double pointAverage = Double.valueOf(validGradesTotal)/Double.valueOf(validGradesCount);
    	double passingAverage = Double.valueOf(passingGradesTotal)/Double.valueOf(passingGradesCount);
    	double passPercentage = 100 * Double.valueOf(passingGradesCount) / Double.valueOf(validGradesCount);
    	
    	System.out.println("Point average (all): " + pointAverage);
    	System.out.println("Point average (passing): " + passingAverage);
    	System.out.println("Pass percentage: " + passPercentage);
    	System.out.println("Grade distribution: "
    			//5: 
    			+ "\n5:"  + fiveStars
    			//4: 
    			+ "\n4:" + fourStars
    			//3: 
    			+ "\n3:" + threeStars
    			//2: 
    			+ "\n2:" + twoStars
    			//1:
    			+ "\n1:" + oneStars
    			//0:
    			+ "\n0:" + zeroStars);
    	
    }
}