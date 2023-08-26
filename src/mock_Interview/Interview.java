package mock_Interview;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		

		String s1="krunal";
		String s2="krunal1";
		
		char[] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		for(int i=0;i<c1.length;i++) {
			
		for(int j=0;j<c2.length;j++) {
			if(c1[i] !=c2[j]) {
				System.out.println(c2[j]);
				break;
			}
			
		}	
		
		}
		/*String res =s2.replace(s1, "");
		System.out.println(res);*/
	}

}
