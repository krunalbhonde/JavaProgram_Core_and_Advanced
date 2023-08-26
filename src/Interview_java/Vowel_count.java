package Interview_java;

public class Vowel_count {

	public static void main(String[] args) {
		// Program to print count of vowel in string
		String s = "Krunal bhonde";
		int count = 0 ;
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'|| c == 'e' || c== 'i' ||c =='o' || c== 'u') {
				count++;	
			}
		}
		
		System.out.println( " The count of vowel in string is "+count);
	}
}
