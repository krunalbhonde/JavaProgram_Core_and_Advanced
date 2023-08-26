package Interview_java;
import java.util.*;
public class FirstLettere {

	public static void main(String[] args) {
		// Program to get the first letter of each word of string
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = s.charAt(0);
		char d = s.charAt(s.length()-1);
		System.out.println("The first letter of string is : " + c);
		System.out.println("The last letter of string is : " + d);
	}

}
