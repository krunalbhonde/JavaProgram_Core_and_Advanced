package Basic_Program;

public class String_lower_Uppercase {

	public static void main(String[] args) {
		// to lower case , upper case , one another way of removing 
		// extra space
		String s = "   Boys   are    played    well  ";
		String[] s1 = s.split("\\s+");   //split it 
		String result = String.join(" ", s1); // join the sentence
        System.out.println( "Extra space remove: " +result.trim());
        System.out.println("Lower Case: "+result.toLowerCase().trim());
        System.out.println("Upper case: "+result.toUpperCase().trim());
	}

}
