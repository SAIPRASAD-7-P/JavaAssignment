package Assignment;

import java.util.Scanner;
public class RemoveCharacters {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input string
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();
		        
		        // Characters to remove
		        System.out.print("Enter characters to remove: ");
		        String charsToRemove = scanner.nextLine();
		        
		        // Remove characters
		        String result = removeChars(inputString, charsToRemove);
		        
		        // Output the result
		        System.out.println("Result: " + result);
		        
		        scanner.close();
		    }
		    public static String removeChars(String inputString, String charsToRemove) {
		        StringBuilder result = new StringBuilder();
		        
		        for (int i = 0; i < inputString.length(); i++) {
		            char currentChar = inputString.charAt(i);
		            if (charsToRemove.indexOf(currentChar) == -1) {
		                result.append(currentChar);
		            }
		        } 
		        return result.toString();
	}
}
