package day18.tc18;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "testleaf";
		String rev = "";
		
		for (int i = str.length()-1; i >=0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		boolean b = str.equalsIgnoreCase(rev);
		if(b==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
