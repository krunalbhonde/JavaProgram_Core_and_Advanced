package Basic_Program;
import java.util.*;
public class Pallimdrom {

	public static void main(String[] args) {
		// write a program for pallimdrom  
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");		
		int n = sc.nextInt();        //121
		palimdrom(n);
	}
     public static void palimdrom(int n) {
    	 int reverse=0;
    	 int original = n;
    	 while (n>0) {
       int reminder= n%10;   // 121%10=12.1, 1.2, 0.1
        reverse = reverse * 10 +  reminder; //0*10+1=1, 12, 121
    		     n=n/10; // 121/10=12, 1, 0
    	 }
    	 if (original==reverse) {
    	 System.out.println( reverse + " is an Palimdrom number");
    	 }else {
    		 System.out.println(reverse + " is not an pallimdrom number");
    	 }
     }
  }
