package Basic_Program;
import java.util.*;     // write a function program for calculator by user
public class Calculator {
 public static void operator(int a, int b,char operator) { 
	 switch (operator) {
	 case '+' : System.out.println("the addition is " + a+b);
	 break;
	 case '-' : System.out.println("the sub is " + (a-b));
	 break;
	 case '*' : System.out.println("the mul is " + (a*b));
	 break;
	 case '/' : System.out.println("the div is " + (a/b));
	 break;
	 case '%' :if (b!=0) {
		 System.out.println("the reminder is " + (a%b));
	 }else {System.out.println("Invalid");	 
	 }
	 break;
	 default : System.out.println("Invalid Number");	 
	 }
 }
  public static void main(String args[]) { 
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the first Number");
	 int a = sc.nextInt();
	 System.out.println("Enter the Second Number");
	 int b = sc.nextInt();
	 System.out.println("Select the Operator");
	char operator = sc.next().charAt(0); // for character use this syntax
	operator(a,b,operator);
  } 
 }
