package day22.tc22;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		// This program is to remove Duplicates from a List in different ways. 
		// First Way 

				List<Character> list = new ArrayList<Character>(); 

				list.add('A'); 
				list.add('B'); 
				list.add('C'); 
				list.add('D'); 
				list.add('A'); 
				list.add('D'); 
				list.add('E'); 
				list.add('F'); 

				System.out.println("With Duplicates: " + list); 

				List<Character> newList = new ArrayList<Character>(); 

				for (int i = 0; i < list.size(); i++) {
					if (!newList.contains(list.get(i))) { 
						newList.add(list.get(i)); 
					}
				}

				System.out.println("Without Duplicates: " + newList); 

				// Another way is to convert the List into Set so that duplicates are avoided 

				Set<Character> pureSet = new LinkedHashSet<Character>(list); 
				System.out.println("\nSecond Approach: " + pureSet);
				
				//Another approach
				
				List<Character> newList1 = list.stream() 
                        .distinct() 
                        .collect(Collectors.toList()); 

				// Print the ArrayList with duplicates removed 
				System.out.println("\nThird Approach: "	+ newList1); 
	}

}
