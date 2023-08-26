package Basic_Program;
import java.util.*;
public class String_Pallimdrom {

	public static void main(String[] args) {
		// Write the program for reverse the string
		// Check whether is it string pallimdrom or not
	
	       
	        Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	       String  s = sc.nextLine(); //nitik
	       String reverse = ""; //default value in string ""
	 
	      for ( int i = s.length() - 1; i >= 0; i-- ) //4
	         reverse = reverse + s.charAt(i);  // k,i,t,i,n
	 
	      if (s.equals(reverse))
	         System.out.println(s+" is a palindrome");
	      else
	         System.out.println(s+" is not a palindrome");
	   }
	}



