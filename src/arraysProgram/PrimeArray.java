package arraysProgram;

public class PrimeArray {

	public static void main(String[] args) {
		// program to find prime number in an array
		
		int a[] = {11,13,14,15,16,17,19,21,23,27};
		System.out.println("prime number");
		for(int j=0;j<a.length;j++) {
			int count =0;
		for(int i=1;i<=a[j];i++) {
			if(a[j]% i ==0) {
				//System.out.print(a[i] +" ");
			count++;
			}
			}
		if(count==2) {
			System.out.println(a[j]);
		}
		}
			

	}

}
