package Interview_java;

public class Intersection_of2Array {

	public static void main(String[] args) {
		// Program to find intersection of elements into arrays
		int [] a = { 23, 36, 96, 78, 55};
		int[] b = { 78, 45, 19, 73, 55};
		System.out.println("Intersection of element in two arrays is ");
		for(int i=0; i<a.length; i++ ) {
		       for(int j=0; j<b.length; j++) {
		           //If element is matched then print it
		           if(a[i] == b[j]) {
		              System.out.print(b[j] + " ");
		            }
		        }
		    }

	}
}
