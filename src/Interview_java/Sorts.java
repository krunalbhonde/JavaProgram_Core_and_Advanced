package Interview_java;
import java.util.*;
public class Sorts {
	public static void main(String[] args) {
		// Programs to sorts names in array 
		String [] s = { "Billu" , "Adam" , "Tillu", "Akki", "Zexo"}; // Array form of string
		for(int i =0;i<s.length;i++){
			for(int j=i+1;j< s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String temp = s[i];
					        s[i] = s[j];
					        s[j] = temp;				
				}
			}
		}
		System.out.println("The sorting Name is ");
		for(int i=0;i<s.length;i++) {
			System.out.print(  s[i] + " ");
		}
	}
  }
 
  //Note : As same as ascending order of array