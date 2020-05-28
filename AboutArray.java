package day25.tc25;

public class AboutArray {

	public static void main(String[] args) {
		// About Array 

		// Array is used to store a collection of elements of the same data type. 
	
		// First method to create an array 

		String[] str = new String[5]; 
		str[0] = "Car"; 
		str[1] = "Bus"; 

		// We need to define the values upto the provided boundary. Here we can give upto 5. 

		// Another method. 

		String[] str1 = {"Truck", "Tank"};  
		char[] ch = {'A', 'B', 'C'}; // With different data type.
		
		System.out.println(str1[0]);
		System.out.println(ch[2]);
		System.out.println(str[1]);
	}

}
