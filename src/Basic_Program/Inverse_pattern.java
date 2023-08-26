package Basic_Program;

public class Inverse_pattern {
	// draw the inverse pattern of *
	public static void main(String[] args) {
		int n = 4;
		for (int i=n; i>=1;i--) {
			for(int j =1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		
	}

 }
