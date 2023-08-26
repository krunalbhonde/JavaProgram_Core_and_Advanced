package Interview_java;

public class Char_decendingFrequency {  //pending

	public static void main(String[] args) {
		// Program to print characters in descending order of frequency
		String s = "acbd";
		char [] c = s.toCharArray();
		int count = 0;
		for(int i =0;i<c.length;i++) {
			
			for (int j= i+1;j<c.length;j++) {
				if (c[i]<c[j]) {
					
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				
					
				}
				 } 
				}
			
			
	    for(int i =0;i<c.length;i++) {
			System.out.println(c[i] + " ");
	
		}

	}

}
