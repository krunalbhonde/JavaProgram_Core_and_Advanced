package Basic_Program;

public class Rotatearray {

	public static void main(String[] args) {
		// Write a program to rotate array
		// Rotate a array by one position
		int[] a= {1,2,3,4,5,6};
		int last=a[a.length -1];
		for(int i=a.length-1;i>0;i--) {
			a[i]= a[i-1];
		}
			a[0]=last;
			for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
			}
		}
   }
