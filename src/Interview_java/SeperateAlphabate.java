package Interview_java;

public class SeperateAlphabate {

	// write the program to separate the alphabet of given string
	
	public static void main(String[] args) {
		
		String s = "afksAKdsfSDFK@#jkKK@#$";
		
		String capital = "";  // null deleclaration
		String small  = "";
		String symbol = "";
		
		
    char [] c = s.toCharArray();
	
	for(char ch:c) {
		
		if(ch >='A' && ch<='Z' ) {
			capital =capital + ch;			
		}
		else if(ch>='a' && ch<= 'z'){
			small = small + ch;
		}
		else {
			symbol =  symbol + ch;
		}
		}
		System.out.println("The capital letter is " +capital);
		System.out.println("The small letter is " +small);
		System.out.println("The symbol is " +symbol);
	}
}
