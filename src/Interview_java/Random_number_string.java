package Interview_java;
import java.util.*;
public class Random_number_string {

	public static void main(String[] args) {
		// Program to generate random number and string in java
		//In these we use math.random() function directly
		System.out.println("Random number is " + Math.random());
          // its showing double data type in decimal
	
	Random rand = new Random(); // it can directly we use 
	int a = rand.nextInt(50);   // 50 shows till we requir
	Double b = rand.nextDouble();
	System.out.println("Random Integer is " + a);
	System.out.println("Random double is " + b);
	}

}
