package Basic_Program;
import java.util.*;

public class OddorEven {
 
	public static void oddoreven(int n) {	
		if(n%2==0) {
			System.out.println(n + " is even number");	
		}
		else {
			System.out.println(n + " is odd number");
		}
		
	}	
	
	
	public static void main(String args[]) {
		//program for whether number is odd or not by user
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		oddoreven(n);
		
	}
}
