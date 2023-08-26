package Advance_Collection;
public class MajorityElement {
	public static void main(String[] args) {
		// Program to find majority element in an array 
		// majority element is that element repeatation is greater 
		//than equal to  the half of size of array
	int a [] = {1,3,4,2,2,2,2};
	int maxcount=0;
	int index = -1;
	for(int i=0;i<a.length;i++) {
		int count =1;	
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) 	{
				count++;
				a[j]=0;
			}		
		}
		if(count>maxcount) {
			maxcount = count;
			index =i;
		}		
		}
	if(maxcount>(a.length/2)) {  // half of the array size
		System.out.println(a[index] + ":"+ maxcount);
	}
	else {
		System.out.println("Majority Element not found");
	}
	}
	}

