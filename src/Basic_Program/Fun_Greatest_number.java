package Basic_Program;

import java.util.Scanner;

public class Fun_Greatest_number {
    //find the greatest of 2 number  
	
	public static void Greatestnumber(int a,int b) {
		if (a > b) {
			System.out.println( a + " is greater than " + b);
			return;
		}else {
				System.out.println(b+ " is grester than " + a);
				return;
			}
		}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a =sc.nextInt();
    	int b = sc.nextInt();
    	Greatestnumber(a,b);
    	  
      }
 }

