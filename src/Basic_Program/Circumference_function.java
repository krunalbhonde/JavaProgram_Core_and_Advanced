package Basic_Program;
import java.util.*;
public class Circumference_function {
   // circumference of circle by entering radius e.r.t function
	public static double Circumference(double radius) {
		
		return 3.14 * 2 * radius;
		
	}
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 double radius = sc.nextDouble();
	 System.out.println("the circumference of circle is " + Circumference(radius));
   }
 }
