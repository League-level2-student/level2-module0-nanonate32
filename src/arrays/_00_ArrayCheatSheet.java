package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruits = {"apple", "bluberry", "strawberry", "peach", "pear"  };
		//2. print the third element in the array
		System.out.println(fruits[2]);
		//3. set the third element to a different value
		fruits[2] = "banana";
		//4. print the third element again
		System.out.println(fruits[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		      for (int i = 0; i < fruits.length; i++) {
				System.out.println(fruits[i]);
			}
		
		//6. make an array of 50 integers
		int[] array = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		int min = array[0];  
		for (int i = 0; i < array.length ; i++) {
			array[i] = random.nextInt();
			 if(array[i] <min) {  
              min = array[i];
			 }
			 System.out.println(array[i]);
		}
		  
		//8. without printing the entire array, print only the smallest number in the array
		 System.out.println("Smallest element present in given array: " + min);  
		//9 print the entire array to see if step 8 was correct
	     
		//10. print the largest number in the array.
	}
}
