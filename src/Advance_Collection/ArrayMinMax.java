package Advance_Collection;

public class ArrayMinMax {
	public static void main(String [] args){
		int a [] = {23,46,1,25,75,91,12,21,51,8};

		for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
		if(a[i]>a[j]){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
		}
		}
		}
		for(int i=0;i<a.length;i++){
		System.out.print(a[i] + " ");

		}
		System.out.println("THe second largest number is " +a[a.length-2]);
		System.out.println("THe second minimum number is " +a[1]);
		}
		}
