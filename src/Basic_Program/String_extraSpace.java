package Basic_Program;

public class String_extraSpace {

	public static void main(String[] args) {
		// Remove Extra Space from string  another way
        String s = "   Boys   are    played    well  ";
       // String[] s1 = s.split(" ");  // Command array to split
      //  String Remove = "";
      //  for(int i =0;i<=s1.length-1;i++) {
        //	if(!s1[i].isEmpty()) {
        	//	Remove = Remove + s1[i] + " ";	
        //	}	
        //}
        // //s is indicating for space
        String s1 = s.replaceAll("\\s+", " ");
        System.out.println(s1.trim());  // trim() is used for removing
	}                    // space from starting  & Ending of sentenance

 }
