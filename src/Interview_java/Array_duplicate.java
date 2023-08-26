package Interview_java;

public class Array_duplicate {

	public static void main(String[] args) {
		// Program to find the duplicate number in java array with their frequency(count)
		int [] a = { 1, 2, 3, 4, 2, 7, 8, 8,8, 3};
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
	     	count++;
			a[j]=0;  //used for does not repetation count of duplicate number
	  	}				// use can use any word instate of 0
			}
			if(count>1 && a[i]!=0 ) {
				System.out.println("The duplicate no.with freq is "+ a[i] + " :" + count);
			}
	 }
	}	
}
	


