package Basic_Program;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// write a program for prime number
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
		int n = sc.nextInt();
		//int n = 6;
		boolean flag= false;
		if(n<= 1) {
			System.out.println("It is not an prime number");
		}else {
       for(int i=2 ;i<n;i++) {
    	   if(n%i==0) {
    		   flag = true;
    		
    		   break;
    	   }
    	  
       }
       if(!flag) {
    	   System.out.println(n + " is an prime number");
       }else {
    	   System.out.println(n + " is not an prime number");
       }
		}
	}

 }
