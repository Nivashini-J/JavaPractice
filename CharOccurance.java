package day18.tc18;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "You have no choice other than following me!";
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) 
		{
			if(ch[i]=='o')
				count = count + 1;
			
		}
		System.out.println(count);

	}

}
