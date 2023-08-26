package arraysProgram;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 20;
		for(int j=2;j<=n;j++) {
			int count =0;

			for(int i=1;i<=j;i++) {
			if(j%i ==0) {
			count++;
		}
		}
		if(count==2)
		System.out.print(j);
	}
	}

}
