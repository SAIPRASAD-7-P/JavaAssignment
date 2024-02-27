package Assignment;

import java.util.Scanner;

public class AdjacentDuplicates {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Remove adjacent duplicates
	        String result = removeAdjacentDuplicates(inputString);
	        System.out.println("String After removing adjacent duplicates: " + result);
	        scanner.close();
	    }
	    public static String removeAdjacentDuplicates(String inputStr) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < inputStr.length(); i++) {
	            char currentChar = inputStr.charAt(i);
	            // Check if the current character is the same as the next character
	            if (i < inputStr.length() - 1 && currentChar == inputStr.charAt(i + 1)) {
	                i++;
	            } else {
	                result.append(currentChar);
	                }
	            }
	        return result.toString();
	    }

}
