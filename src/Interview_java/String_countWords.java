package Interview_java;

public class String_countWords {

	public static void main(String[] args) {
		// Program to count number of words in a given string
		String s = "My Name is Krunal Bhonde";
		int count = 1;
		for(int i = 0; i<s.length()-1;i++) {
			if(s.charAt(i)== ' ' && s.charAt(i+1)!=' ') { // 
				count++;
			}
		}
		System.out.println("The number of words in string is " + count);
	}
}
