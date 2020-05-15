package day20.tc20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "balaji.chandrasekaran@testleaf.com"; 
		String regex = "[A-Z0-9]+[._]+[A-Z0-9]+@[A-Z0-9]+.[A-Z.]{2,}"; 

		// Alternative regular expression: "^(.+)@(.+)$" --> Before and after ‘@’ symbol, there can be any number of characters. 
		
		//"^[A-Za-z0-9+_.-]+@(.+)$"
		/*1) A-Z characters allowed
		2) a-z characters allowed
		3) 0-9 numbers allowed
		4) Additionally email may contain only dot(.), dash(-) and underscore(_)
		5) Rest all characters are not allowed*/

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  
		Matcher match = pattern.matcher(email); 

		System.out.println(match.matches());

	}

}
