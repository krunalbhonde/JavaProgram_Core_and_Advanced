package Advance_Collection;


	 
	public class StringCompression
	{
	 public static void main(String[] args) {
	// Write down the program for String Compression
			String s = "I am Krunal bhonde";
			char[] c = s.toCharArray();
			
			for(int i=0;i<c.length;i++) {
				int count=1;
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
		     	count++;
				c[j]=0;  //used for does not repetation count of duplicate word
		  	}				// use can use any word instate of 0
				}
				if(count>=1 && (c[i]!=0 && c[i]!=' ') ) {
					System.out.print(c[i] + ""+ count);
				}
			}
}
	}