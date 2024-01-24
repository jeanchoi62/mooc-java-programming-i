import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        smallest(array);
    }
    
    public static int smallest (int[] list)  {
    	int lowest = list[0];
        for (int i = 0; i < list.length; i++) {
        	if (list[i] < lowest) {
        		lowest = list[i];
        	}
        }
        return lowest;
        
    }
    
    public static int indexOfSmallest(int[] list) {
    	int smallestNumber = smallest(list);
    	int index = 0;
    	for (int i = 0; i < list.length; i++) {
    		if (smallestNumber == list[i]) {
    			index = i;
    		}
    		
    	}
    	return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    	int newArrayLength = table.length - startIndex; // = 2
    	int startIndexCopy = startIndex;
    	int newArray[] = new int[newArrayLength];
    	for (int i = 0; i < newArrayLength; i++) {
    		newArray[i] = table[startIndex];
    		startIndex++;
    	}
    	return ((indexOfSmallest(newArray)) + startIndexCopy);
    }
    
        public static void swap(int[] array, int index1, int index2) {
    	int valueOfIndex1 = array[index1];
    	int valueOfIndex2 = array[index2];
    	
    	array[index1] = valueOfIndex2;
    	array[index2] = valueOfIndex1;
    }
        
    public static void sort(int[] array) {
    	
    	for (int i = 0; i < array.length; i++) {
    		int smallestInteger = array[indexOfSmallestFrom(array, i)];
    		swap(array, i, indexOfSmallestFrom(array,i));
    		//print out the array
    	}
    	
    }    

}