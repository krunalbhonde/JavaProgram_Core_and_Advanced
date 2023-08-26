package Interview_java;

public class String_words {

	public static void main(String[] args) {
		// Print number of words,character frequency string.
		
				String s = "krunala";
				char[] c = s.toCharArray();
				System.out.println("Number of words " + c.length);
				for(int i=0;i<c.length;i++) {
					int count=1;
					for(int j=i+1;j<c.length;j++) {
						if(c[i]==c[j]) {
			     	count++;
					c[j]=0;
					
					//used for does not repetation count of duplicate word
			  	}				// use can use any word instate of 0
					}
					
					if(count>=1 && c[i]!=0 ) { // change only count comparision >
						System.out.println(c[i] + " :" + count);
					}
	}
	}	
}
