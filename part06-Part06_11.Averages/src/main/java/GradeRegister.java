
import java.util.ArrayList;

public class GradeRegister {
    public ArrayList<Integer> grades;
    public ArrayList<Integer> gradesPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradesPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        double average = 0;
        double gradeSum = 0;
        if (this.grades.size() == 0) {
                return -1.00;
            }
        else {
            for (int i = 0; i<this.grades.size(); i++) {

            gradeSum += this.grades.get(i);
        }
        average = gradeSum/this.grades.size();
        return average;
        }
    }
    
    public double averageOfPoints() {
        double sum = 0;
        double average = 0; 
        
        if (this.grades.size() == 0) {
                return -1.00;
        }
        else {
        for (int i = 0; i<this.gradesPoints.size(); i++) {
            sum += this.gradesPoints.get(i);
        }
        average = sum/this.gradesPoints.size();
        return average;
    }
}
    
}
