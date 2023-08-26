package Interview_java;

public class Countdigit {

	public static void main(String[] args) {
		// program to count digit in a number
		int a = 123456789;
		int count = 0;
		while(a!=0) { //123456789 
			a = a/10; //12345678, 1234567
			count++; //1,2,3,4,5,6,7,8,9
		}
		System.out.println("In number count of digit is " + count);
	}

}
