package Interview_java;
import java.util.*;
public class RandomString {
	public static void main(String[] args) {
		String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lowercase = "abcdefghijklmnopqrstuvwxyz";
		String Number ="0123456789";
		String Alpha_numeric = Uppercase + Lowercase + Number; // combine all string
		StringBuilder sb = new StringBuilder();  //Create rondom string
		
		Random rand = new Random();   // create a object of  random class
		int length = 10;  //specific length of random string
		for(int i=0; i<length;i++) {
		int index = rand.nextInt(Alpha_numeric.length()); // generate the random index number
		char Randomchar = Alpha_numeric.charAt(index);  //get a char from specified index
		sb.append(Randomchar);  //append the char to string builder
		
		}
		String Random_string = sb.toString();
	    System.out.println("Random String is " + Random_string);
	}

}
