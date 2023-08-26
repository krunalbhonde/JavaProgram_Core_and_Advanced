package Interview_java;

public class AllSubstring {

	public static void main(String[] args) {
		// Program to print all the substring from a given substring
		String s = "abcd";
		for(int i =0; i<= s.length();i++) {
			for(int j=i+1;j<=s.length();j++ ) {
				String s1 = s.substring(i, j);  //substring function
				System.out.println(s1);
			}
		}
	}
}
