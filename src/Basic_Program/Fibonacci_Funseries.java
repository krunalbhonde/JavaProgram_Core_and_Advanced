package Basic_Program;
import java.util.*;
public class Fibonacci_Funseries {

	public static void main(String[] args) {
		// write a program for Fibonacci Series
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo(n);
		
	}
	public static void fibo(int n) {
		int a = 0;
		System.out.print(a + " ");
		int b = 1;
		System.out.print(b + " ");
		int sum = 0;
		if  (n<1) {
			System.out.println("Invalid number");
		}else {
			for(int i=0;i<n;i++) {
				sum = a + b;   //0+1=1
				System.out.print(sum + " ");;  //0+1
				a=b;     // a=1
				b=sum;    // b= 1
			}
		}
		
		
	}

}
