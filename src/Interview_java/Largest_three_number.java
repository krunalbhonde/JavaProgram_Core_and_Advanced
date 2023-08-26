package Interview_java;
public class Largest_three_number {

	public static void main(String[] args) {
		// Program to largest of three number
         int a = 14;
         int b = 78;
         int c = 488;
         if (a>b && a>c) {
        	 System.out.println( a + " is largest number than " +b +" and " + c);
         }else if(b>a && b>c) {
        	 System.out.println( b + " is largest number than " +a +" and " + c);
         }else {
        	 System.out.println( c + " is largest number than " +a +" and " + b);
         }
	}

}
