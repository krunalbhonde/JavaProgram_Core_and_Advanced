package Basic_Program;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// write a program to check the charater is vowel or not
		Scanner sc = new Scanner(System.in);
          char c =sc.next().charAt(0);  
         vowel(c);
	}
	public static void vowel(char c) {
		if(c =='a'|| c =='i'|| c == 'o' ||c =='u'||c == 'e') {
			System.out.println(c + " is an vowel ");
		}else {
			System.out.println(c + " is not an vowel");
		}
	}

}
