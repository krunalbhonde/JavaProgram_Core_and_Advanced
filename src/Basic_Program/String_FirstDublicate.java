package Basic_Program;

public class String_FirstDublicate {

	public static void main(String[] args) {
		// write a program of string  First Duplicate
		String s = "asadsfd";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.println("The First dublicate is "+c[i]);
					break; // till this break output is all duplicate char
				}          // a s d
			}
			break; // till this break output is First duplicate char
		}          // a
	}
 }
