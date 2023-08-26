package Basic_Program;

public class String_Distinguishcount {
	public static void main(String[] args) {
		// write a program for lower case ,upper case, symbol count, space count
		String s = "asdkfl  gHkj@  #$%^  &*KIHNHt  ftHBH$8JHv";
		int Capitalcount=0;
		int Smallcount=0;
		int Symbolcount=0;
		int spacecount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				Capitalcount++;
			}else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
				Smallcount++;
			}else if (s.charAt(i)==' ') {
				spacecount++;				
			}else {
				Symbolcount++;
			}
		}
		System.out.println("The Capital letter count is " +Capitalcount);
		System.out.println("The Small letter count is " +Smallcount);
		System.out.println("The Space count is " +spacecount);
		System.out.println("The Symbol count is " +Symbolcount);
	}
 }
