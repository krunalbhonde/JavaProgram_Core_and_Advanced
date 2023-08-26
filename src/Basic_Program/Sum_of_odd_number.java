package Basic_Program;

import java.util.Scanner;

public class Sum_of_odd_number {
	//sum of all odd number from 1 to n by using function
	public static void printsum(int n) {
		int sum = 0;
		for (int i =1; i<=n; i++) {
		if	(i % 2 != 0 ) {
			sum = sum + i;
		}
		}
		System.out.println("The sum of all odd number is " + sum);
			return;
				
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		printsum(n);
		
	}

 }
