package Interview_java;

public class Majority_ElementArray {
	public static void main(String[] args) {
		// Program to find majority element in array
		int [] a = { 1, 2, 2, 2, 3,};
		int maxCount = 0;
		int index = -1; // sentinal
		System.out.println("Length of array " + a.length);
		for (int i = 0; i< a.length;i++) { // 1
			int count = 0;
			for(int j=0;j<a.length;j++) {// 1,1,2
				if(a[i] == a[j]) { // 1==1
					count++;   // 1,2,3,4
				}
			}
				if(count > maxCount) { // 4>0
					maxCount = count;   //4
					index = i;      //0
				}
			}
			if(maxCount> a.length/2) { //if maxCount is greater than n/2  
		        // return the corresponding element
			System.out.println("Major Element is " + a[index]);
			}else {
				System.out.println("No major element found");
			}
		}
		
	}


