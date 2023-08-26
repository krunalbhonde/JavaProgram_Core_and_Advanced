package Basic_Program;

public class Array_Asecending {

	public static void main(String[] args) {
		// Write a program of array to arrange ascending order
		int [] a = { 8,5,3,7,2,9,1};
		//
		for(int i=0; i<a.length;i++) {  // 8
			for(int j=i+1;j<a.length;j++) { // 5
				if(a[i]>a[j]) {  // 8>5, 
				int temp = a[i]; // 8,9
					a[i] = a[j]; // 5,
					a[j] = temp; // 8,
				}
				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print( a[i] + " " );
		}

	}

 }
