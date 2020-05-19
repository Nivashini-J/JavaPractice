package day21.tc21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.plaf.synth.SynthSpinnerUI;

public class PrintList {

	public static void main(String[] args) {
		// This program is to print a list in three different way.
		//Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]
		
		String str = "Bugatti Chiron"; 

		char[] ch = str.toCharArray(); 
		List<Character> charList = new ArrayList<Character>(); 

		for (Character character : ch) {
			charList.add(character); 
		}
		System.out.println("***Approach 1***");
		System.out.println(charList); 

		// Second Way 

		List<Character> secList = new ArrayList<Character>(); 

		for (int i = 0; i < ch.length; i++) { 
			secList.add(ch[i]); 
		} 
		System.out.println("***Approach 2***");
		System.out.println(secList); 
		
		// Third Way 
		List<Character> thirdList = new ArrayList<Character>(); 
		for (int i = 0; i < str.length(); i++) { 
			thirdList.add(str.charAt(i)); 
		} 

		int count = 0; 
		System.out.println("***Approach 3***");
		while (count<thirdList.size()) {
			System.out.print(thirdList.get(count)); 
				count++;
			} 
		
		// Additional Way 

		List<Character> fourList = new ArrayList<Character>(); 

		for (int i = 0; i < str.length(); i++) { 
			fourList.add(str.charAt(i)); 
		} 

		Iterator<Character> it = fourList.iterator(); 
		System.out.println("\n***Approach 4***");
			while (it.hasNext()) {
				System.out.print(it.next());
			}
	}

}
