package Advance_Collection;
import java.util.TreeSet;
public class RemoveDuplicateAcs {
	public static void main(String[] args) {
		// Program sorting an array of number & String in ascending
		//order by removeing duplicate
		int a[] = {9,8,7,7,6,5,5,4,6,3,2,2,1,1};
	printNumber(a);
	String s = "aslndsdlandsksdanl";
	printString(s);
	}
	public static void printNumber(int[]a) {
		TreeSet ts = new TreeSet();
       for(int i :a) {
    	   ts.add(i);
       }
       System.out.print(ts);
	}
	public static void printString(String s) {
		char[] c = s.toCharArray();
		TreeSet tk = new TreeSet();
		for(char ch : c) {
			
			tk.add(ch);	
		}
		System.out.println();
		System.out.print(tk);	
	}
	}


