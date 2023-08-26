package Interview_java;

public class Sumofcount {

	public static void main(String[] args) {
		// Program to count sum of digit in a number
		int a = 12345; //1+2+3+4+5
		int rem = 0;
		int sum = 0;
		while(a!=0) {
			rem = a % 10;
			sum = sum + rem;
			a=a/10;
		}
		System.out.println("The sum of digit in number is " +sum );
	}
}
