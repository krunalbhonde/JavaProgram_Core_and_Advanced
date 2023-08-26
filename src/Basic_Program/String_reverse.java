package Basic_Program;

public class String_reverse {

	public static void main(String[] args) {
		// Reverse the string    
		String s = " Boys are played well";
		String Reverse = "";             // char[] c = s.toCharArray();
		for(int i= s.length()-1;i>=0;i--) {   // for(int i = c.length-1)
			Reverse =Reverse + s.charAt(i);   // c[i]
		}
       System.out.print("The reverse string is: " + Reverse);
	}

}
