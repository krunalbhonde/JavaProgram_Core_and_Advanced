package Basic_Program;

import java.util.Arrays;

public class Sorting_array {

	public static void main(String[] args) {
//Write a program to sorting the negative and positive number separately
		int [] a= {8,9,20,-1,-7,67,-4,5};
		
		Arrays.sort(a); // Sorting command ,we can directly we use in interview
		System.out.print("The -ve & +ve number seperation is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

 }
