package Basic_Program;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		//to check whether string is anagram or not ex. java , aavj
		// anagram meaning a word or phrase that's formed by
		//rearranging the letters of another word or phrase.
		String s1 = "jaav";
		String s2 = "java";
		if(s1.length()==s2.length()) {
			char[] c1 =s1.toCharArray();
			char[] c2 =s2.toCharArray();
			Arrays.sort(c1);   //sorting char via alphabate
			Arrays.sort(c2);
	        boolean Result = Arrays.equals(c1, c2); // In array 2 char compair
			if(Result) {
				System.out.println(s1 + " and "+ s2+  " is a anagram");
			}else {
				System.out.println(s1 + " and "+ s2+  " is not a anagram");
			}
		}else {
			System.out.println(s1 + " and "+ s2+  " is not a anagram");
		}
	}
  }
