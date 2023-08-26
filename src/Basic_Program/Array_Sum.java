package Basic_Program;

public class Array_Sum {

	public static void main(String[] args) {
		// write a program to sum of array element
		int []a = { 1,4,56,78,99};	
		Array_Sum as = new Array_Sum();  //In non Static we required
        as.Sum(a);		              // to assign object in that
	}
		public  void Sum(int[] a) {
		int add= 0;
		for(int i:a) {
			
			add= add + i;
		}
		System.out.println("The sum of Array is " + add);
	}

}
