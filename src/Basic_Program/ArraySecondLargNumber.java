package Basic_Program;

public class ArraySecondLargNumber {

	public static void main(String[] args) {
		// write down program for array of second largest number
		int [] a = { 8,5,3,7,2,9,1};
		for (int i=0;i<a.length;i++) {
			for(int j= i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				}			
			}
		}
		System.out.print("The second last largest number is " + a[a.length-2]);
	}
 }
