package Advance_Collection;

public class LinearSearch {

	public static void main(String[] args) {
		// write a program for linear Search
		
		int []a = {1,2,3,4,5,6,7,8};
		int i =0;
		int search = 5;
		
		for( i=0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println(search +" is present at  index "+ i );
				break;
			}
			
		}
		if(i==a.length)
		{
			System.out.println(search +" is not present in array");
			
		}	
		
		

	}

}
