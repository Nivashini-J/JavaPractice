package day19.tc19;

public class FindTypes {

	public static void main(String[] args) {
		
		//1. To print the number of upper cases, lower cases, numbers, spaces and special characters of a given string
		
		String test = "1. It is Work From Home not Work for Home";
		int  uppcase = 0, lowCase = 0, space = 0, num = 0, specialChar = 0;
			
		char[] ch = test.toCharArray();
		for (int i = 0; i <= ch.length-1; i++) 
		{
			if(Character.isUpperCase(ch[i])==true)
				uppcase = uppcase+1; 
			
			else if(Character.isLowerCase(ch[i])==true)
				lowCase = lowCase + 1;
		
			else if(Character.isSpaceChar(ch[i])==true)
				space = space+1; 
			
			else if(Character.isDigit(ch[i])==true)
				num = num+1; 
			else
				specialChar = specialChar+1;
		}
		
		System.out.println("***Approach 1 - Using Character class***");
		System.out.println("Length of the given string:"+test.length());
		System.out.println("Upper Case:"+uppcase);
		System.out.println("Lower Case:"+lowCase);
		System.out.println("Space:"+space);
		System.out.println("Digits:"+num);
		System.out.println("Special Characters:"+specialChar);
		
		//2. Another approach using Regex 

		System.out.println("***Approach 2 - Using Regular Expression***");
		String txt = "1. It is Work From Home not Work for Home"; 

		String spaceStr = txt.replaceAll("[^ ]", ""); 
		System.out.println("Space:" + spaceStr.length()); 

		String numStr = txt.replaceAll("[^0-9]", ""); 
		System.out.println("Digits:" + numStr.length()); 

		String upperStr = txt.replaceAll("[^A-Z]", ""); 
		System.out.println("Uppercase:" + upperStr.length()); 

		String lowerStr = txt.replaceAll("[^a-z]", ""); 
		System.out.println("Lowercase:" + lowerStr.length());
		
		//3. Another Approach 
		String input = "1. It is Work From Home not Work for Home"; 
		
		System.out.println("***Approach 3***");
		System.out.println("Digits:"+input.chars().filter((c)->Character.isDigit(c)).count());
		System.out.println("Lowercase:"+input.chars().filter((c)->Character.isLowerCase(c)).count());
		System.out.println("Uppercase:"+input.chars().filter((c)->Character.isUpperCase(c)).count());
		System.out.println("Spaces:"+input.chars().filter((c)->Character.isSpaceChar(c)).count());
		
	}

}
