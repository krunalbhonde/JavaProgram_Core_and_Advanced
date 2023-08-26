package Interview_java;

public class Array_moveZero {

	public static void main(String[] args) {
		// program to move all zero to end of array
		int [] a = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;  // count the this cycle how many time it will performed
			}         // non zero element
		}
			for(int i =0;i<a.length;i++) {
			  System.out.print(a[i] + " ");	
			}
		

	}

}
