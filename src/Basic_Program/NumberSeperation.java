package Basic_Program;

public class NumberSeperation {

	public static void main(String[] args) {
		// //Write a program to sorting the negative and positive number separately
		int [] a= {8,9,20,-1,-7,67,-4,5};
         int temp = 0;
         int j = 0;
		for(int i=0;i<a.length;i++) { 
		     if(a[i]<0) {
		    	 if(i!=j) {//i is not equal to 0
		    		 temp = a[i];  // swap technique
		    		 a[i]= a[j];
		    		 a[j] = temp;
		    	 }
		    	 j++;  // increment 
		     }
		}
		System.out.print("The Sorting array +ve & -ve number is ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
