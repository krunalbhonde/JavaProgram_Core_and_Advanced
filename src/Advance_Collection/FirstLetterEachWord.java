package Advance_Collection;

public class FirstLetterEachWord {

	public static void main(String[] args) {
		// Program to get first letter of each word of String
	String s = "My name is Kalyani Krunal Bhonde";
	char[] c = s.toCharArray();
	for(int i=0;i<c.length;i++) {
		
		if(c[i] !=' ' && (i==0 || c[i-1]==' ') ) { // M && 0
			System.out.println(c[i]);
		}
	}
	

	}

}
