package day20.tc20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {

	public static void main(String[] args) {

		// This program is to validate the user name in the given condition 
		// 1. It should contain minimum 8 characters.
		// 2. It allows alpha numeric characters and special characters like . _ @ $ 

		String str = "T$123"; 
		String regex = "[a-zA-Z0-9._@$]{8,}"; 
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(str); 
		System.out.println(matcher.matches());

		
		/*Alternative expression: regex = "^[aA-zZ]\\w{5, 29}$"
		Where:

			“^” represents that starting character of the string.
			“[aA-zZ]” makes sure that the starting character is in the lowercase or uppercase alphabet.
			“\\w{5, 29}” represents a check to make sure that the remaining items are word items, which includes the underscore, until it reaches the end and that is represented with $.
			The “{5, 29}” represents the 6-30 character constraint given to us minus the predefined first character.*/
	}

}
