package Basic_Program;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		// write a program for amstrong number hint 153= 1^3+5^3+3^3
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();  //153
        amstrong(n);
	}
	public static void amstrong(int n) {
		int sum=0;
	    int original = n;
	    while(n>0) {
	    	int rem = n%10; //153%10=15.3, 1.5,0.1
	    	sum = sum +(rem*rem*rem); //0+3*3*3=27, 27+3*3*3=125
	                                   // 125+1=153
	    	n=n/10; //153/10=15,1,0
	    }
	    if(original==sum) {
	    	 System.out.println(sum + " is an Amstrong number");
	    }else {
	    System.out.println(sum + " is not an Amstrong number");
	      }
	    }

}
