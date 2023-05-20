package alphaNumericString;

import java.util.Random;

public class AlphaNumericString {
	
	public static void main(String[] args) {
		// ASCII values of [0 - 9] : 48 to 57
		// ASCII values of [A - Z] : 65 to 90
		// ASCII values of [a - z] : 97 to 122
		
		int lowerBound = 48; 		//  '0'
	    int upperBound = 122; 		//  'z'
	    int maximumStringLength = 20;
	    
	    Random random = new Random();

	    String alphaNumericString = random.ints(lowerBound, upperBound + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(maximumStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    System.out.println("AlphaNumeric String : " + alphaNumericString);

	}

}
