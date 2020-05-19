package day21.tc21;

public class DuplicateChar {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String str = "";
		String[] in = text.split(" ");
		for (int i = 0; i < in.length; i++) 
		{
			str = str + in[i];
		}
		System.out.println(str);
		String output = "";
		char[] ch = text.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
					count++;
			}
			if(count == 1)
				output = output + ch[i];
			}
		System.out.print(output);
	}
}
