package day19.tc19;

public class ReverseEvenWords {
	
	//Expected Output:When eht world esilaer its nwo mistakes, anoroc will evlossid automatically

	public static void main(String[] args) {
				
		String test = "When the world realise its own mistakes, corona will dissolve automatically"; 
		String[] word = test.split(" ");
		String result="";
		for (int i = 0; i <= word.length-1; i++) {
			if(i%2==1) 
			{
				char[] ch = word[i].toCharArray();
				String str = ""; 
				for (int j = ch.length-1; j>=0; j--) 
				{
					str = str + ch[j];
				}
				result = result + str +" ";
			}
				else
					result = result + word[i] +" ";
			}
		System.out.println(result);
		
	}
}


