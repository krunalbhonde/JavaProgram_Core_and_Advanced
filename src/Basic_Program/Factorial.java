package Basic_Program;

import java.util.*;

public class Factorial {
	 public static void printfactorial(int n) {
		 int factorial = 1;
		if(n<0) {
			System.out.println("Invalid number");
		}
		else {
		 for(int i=n;i>=1;i--) {
		factorial= factorial * i;	
			 
		 }
		 System.out.println("The factorial is " + factorial);
		 return;
	 }
	 }
	
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
		printfactorial(n);
	}

	}

