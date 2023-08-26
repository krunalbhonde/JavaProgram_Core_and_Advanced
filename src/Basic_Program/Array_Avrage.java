package Basic_Program;

public class Array_Avrage {

	public static void main(String[] args) {
		// Write a program of average of an array
      int []a= { 1,4,56,78,99 };
      Array_Avrage aa = new Array_Avrage();
     int sum_A = aa.average(a);
      System.out.println("The sum of array is " + sum_A);
     System.out.println("The Length of array is " + a.length);
      System.out.println("The average of an arrary is " + (sum_A/a.length));
	}
	public int average(int a[]) {
		int sum = 0;
		for(int i :a) { // Another way of use for loop in array for addition of element
		sum = sum + i ;
		}
		return sum;		
		
	}

 }
