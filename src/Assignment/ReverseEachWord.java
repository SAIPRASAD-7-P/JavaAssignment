package Assignment;

public class ReverseEachWord {

	public static void main(String[] args) {
		
	     String inputString = "Hello World!";
	     String reversedString = reverseWords(inputString);
	     System.out.println("Original String: " + inputString);
	     System.out.println("Reversed String: " + reversedString);
	}

	public static String reverseWords(String inputString) {
		String[] words = inputString.split(" ");
	    StringBuilder reversedString = new StringBuilder();

	    for (String word : words) {
	    	StringBuilder reversedWord = new StringBuilder(word);
	        reversedString.append(reversedWord.reverse()).append(" ");
	}

	    return reversedString.toString().trim();
	    
	 }
}