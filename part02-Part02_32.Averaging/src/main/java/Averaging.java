
public class Averaging {

    
    public static double sum(int number1, int number2, int number3, int number4) {
        double total = number1 + number2 + number3 + number4;
        return total;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double avg = sum(number1, number2, number3, number4) / 4;
        return avg;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
