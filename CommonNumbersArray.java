package day26.tc26;

public class CommonNumbersArray {

	public static void main(String[] args) {
		// Write a java program to print the common numbers in between the two arrays.

				int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
				int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 }; 
				System.out.println("***Approach 1***");
				for (int i = 0; i < array1.length; i++) { 
					for (int j = 0; j < array2.length; j++) { 
						if (array1[i] == array2[j]) { 
							System.out.println("Common element: " + array1[i]);
						}
					}
				} 

				// Another way is using for each loop 
				System.out.println("\n***Approach 2***");
				for (int num : array1) { 
					for (int k = 0; k < array2.length; k++) { 
						if (num == array2[k]) { 
							System.out.println("Common number: " + num);
						}
					}
				}
	}
}
