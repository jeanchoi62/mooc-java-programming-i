
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }
    
        public double averageOfGrades() {
        double average = 0;
        double gradeSum = 0;
        if (this.register.grades.size() == 0) {
                return -1.00;
            }
        else {
            for (int i = 0; i<this.register.grades.size(); i++) {

            gradeSum += this.register.grades.get(i);
        }
        average = gradeSum/this.register.grades.size();
        return average;
        }
    }
        
        public double averageOfPoints() {
        double sum = 0;
        double average = 0; 
        
        if (this.register.grades.size() == 0) {
                return -1.00;
        }
        else {
        for (int i = 0; i<this.register.gradesPoints.size(); i++) {
            sum += this.register.gradesPoints.get(i);
        }
        average = sum/this.register.gradesPoints.size();
        return average;
    }
}

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
        System.out.println("The average of points: " + averageOfPoints());
        System.out.println("The average of points: " + averageOfGrades());
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
