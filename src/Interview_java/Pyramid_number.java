package Interview_java;

public class Pyramid_number {

	public static void main(String[] args) {
		// Program to print pyramid pattern of numbers
		
		int n = 4;
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" "); // spaces
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
		
		System.out.println();
		}
	}

}
