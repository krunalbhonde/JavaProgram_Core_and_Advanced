package Basic_Program;

public class Array_SumOfTwoElement {

	public static void main(String[] args) {
		// Write a program for sum of two array element
		int [] a = { 1,4,56,78,99};
		int [] b= { 5,6,76,87,89};
		Array_SumOfTwoElement  as = new Array_SumOfTwoElement();
		int sumA= as.Add(a);
		int sumB = as.Add(b);
		System.out.println("The Sum of two array element is " + (sumA+sumB));
	}
    public int Add(int[]array) {
		int sum = 0;
		for(int i : array) {
			sum = sum +i;
		}
    	return sum;
    	
    }
}
