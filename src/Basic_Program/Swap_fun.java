package Basic_Program;

import java.util.*;
public class Swap_fun {

	public static void main(String[] args) {
		// write a program to swap a two number
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the a value : "); 
       int a= sc.nextInt();
        System.out.print("Enter the b value : ");
        int b= sc.nextInt();
      	swap(a,b);
	}
	 public static void swap(int a, int b) {
		 int temp = 0;
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.println("the swap value of a :" +a);
	     System.out.println("the swap value of b :" +b); 
		 
	 }

}
