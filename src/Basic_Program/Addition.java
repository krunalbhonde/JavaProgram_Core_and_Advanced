package Basic_Program;
import java.util.*;

public class Addition {
	//addition of 2 number by user with the help of function
	
	public static int addition (int a, int b) {
		return a + b;
		  
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Addition of two number is " + addition(a,b));
	}

 }
