package Interview_java;

import java.util.Arrays;

public class Arrayace_dupil_remov {

	public static void main(String[] args) {
		// Program sorting array in ascending order by removing duplicate
		int a[] = { 8,7,5,6,4,2,6,1,3,4};
		/*for(int i = 0; i<a.length;i++) { // 8
			for(int j = i+1; j<a.length;j++) { // 
				if (a[i]>a[j]) { 
					int temp = a[i];// 8
					a[i] = a[j];  //7
					a[j] = temp;  // 8
					
				}
                 
			}
		}*/
		Arrays.sort(a);
		
		System.out.print("The Ascending order is ");
		for(int i=0;i<a.length;i++) {
			
			System.out.print( a[i] + " ");
		}
	
		

	}

}
