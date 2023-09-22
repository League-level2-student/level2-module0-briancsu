package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"We", "are", "so", "cool"};		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "really";
		System.out.println(arr[2]);
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
		int[]hi = new int[50];
		//6. make an array of 50 integers
		Random ran = new Random();
		for(int i = 0; i < 50; ++i) {
			hi[i] = ran.nextInt(100);
		}
		Arrays.sort(hi);
		//7. use a for loop to make every value of the integer array a random number
		System.out.println(hi[0]);
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0; i < 50; ++i) {
			System.out.println(hi[i]);
		}
		//9 print the entire array to see if step 8 was correct
		System.out.println(hi[49]);
		//10. print the largest number in the array.
	}
}
