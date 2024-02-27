package Assignment;

import java.util.Arrays;

public class StringToInteger {
	public static void main(String[] args) {
	
	String inputString = "10 20 30 40 50"; // Example input string
    int integerArray[] = convertStringToIntegerArray(inputString);
    System.out.println("Integer Array: " + Arrays.toString(integerArray));
}

       public static int[] convertStringToIntegerArray(String inputString) {
    	   String[] stringArray = inputString.split(" "); 
           int[] integerArray = new int[stringArray.length];
           for (int i = 0; i < stringArray.length; i++) {
           integerArray[i] = Integer.parseInt(stringArray[i]);
    }
       return integerArray;
    }
}