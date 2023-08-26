package Advance_Collection;

public class BinerySearch {

	public static void main(String[] args) {
		// program to search element in a array by using binery search
		
		int a[] = {50,20,30,40,60,70};
		
		int search = 20;
		
		int first =0;              //0
		int last = a.length-1;      //3
		int middle =(first + last)/2; //1
		
		while(first<= last) {         // 0<=3
			if(a[middle]>search) {     //a[1]>20
				first =middle +1;
			}else if(a[middle]==search) {  // a[1]=20
				System.out.println(search + " found at index " + middle);
				break;
			}else {
				last = middle-1;
			}	
		}
		if(first>last) {
			System.out.println(search + " Not found in the list ");
		}

	}

}
