package Basic_Program;
import java.util.*;
public class ReverseNumber { // Write the program for reverse number

	public static void main(String[] args) {
	//int n = 123456789, reverse = 0;  
	//we have not mentioned the initialization part of the for loop  
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the Number ");
	int n = sc.nextInt();
	int reverse=0;
	while(n != 0)   
	{  
	int remainder = n % 10;  
	reverse = reverse * 10 + remainder;  
	n = n/10;  
	} 
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

	}


