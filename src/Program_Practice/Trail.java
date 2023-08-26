package Program_Practice;
import java.util.Arrays;
public class Trail {
	
	public static void main(String[] args){
		int[] a = {12,45,36,45,12,89,74,25,49};
		int []b = {45,74,64,16,12,50,89,23,40};

		for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
		if(a[i]==b[j]){
		System.out.print(a[i] + " ");
		}
		}
		}
		}

		}