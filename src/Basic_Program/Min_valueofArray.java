package Basic_Program;

public class Min_valueofArray {

	public static void main(String[] args) {
		// Write the program for find out minimum number of an array
		int [] a= { 8,5,3,7,9,1};
		int min = a[0];  //8
		for(int i=1; i<a.length;i++) { //
			if (min>a[i]) {
				min = a[i];
			}
		}
		System.out.println(" The Minimun value of an array " + min);

	}

}
