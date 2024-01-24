import java.util.*;
        

public class Main {

    public static void main(String[] args) {
        // insert test code here
    	ArrayList<String> strings = new ArrayList<String>();
    	strings.add("Geek");
    	strings.add("Banana");
        int[] array = {2, 1, 3, 0};
        Collections.sort(strings);
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(7);
        list.add(0);
        Collections.sort(list);
        int[] numbers = {4, 4, 12, 7, 34, 67};
        Arrays.sort(numbers);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
        
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}