package day19.tc19;

public class SumofNumbersinString {
	
	//Expected output = 1 + 9 + 8 + 7 = 25

	public static void main(String[] args) {
		
		//Approach 1 - using regular expression
		String input = "asdf1qwer9as8d7";
		String numStr = input.replaceAll("\\D", "");
		int num = Integer.parseInt(numStr);
		int sum = 0;
		
		while (num != 0) {
			sum = sum + num % 10; 
			num = num/10;  
		} 
		System.out.println("***Approach 1***");
		System.out.println("Extracted numbers from the given string:"+numStr);
		System.out.println("Sum of the given digitis:" +sum);
		
		//Approach 2 - using Character class & getNumericvalue() method
		String str = "asdf1qwer9as8d7";
		int sum1 = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum1 = sum1 + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("***Approach 2***");
		System.out.println("Sum of the given digits:"+sum1); 
		
		//Approach 3 using Character class
		String txt = "asdf1qwer9as8d7";
		int sum2 = 0;
		
		for (int i = 0; i < txt.length(); i++) {
			if(Character.isDigit(txt.charAt(i))) {
				sum2 += txt.charAt(i) - '0';
			}
		}
		System.out.println("***Approach 3***");
		System.out.println("Sum of the given digits:"+sum2);
	}

}
