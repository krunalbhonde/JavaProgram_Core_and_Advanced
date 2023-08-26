package Advance_Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		//  Set : does not allow duplicate value , only unique value allowed

		String s = "dalfljaadfjebre";
		char [] c = s.toCharArray(); 
		
		//HashSet	: unorder way print 
		HashSet hs = new HashSet();
		for(char ch:c) {
			hs.add(ch);
		}
		System.out.println(hs);
	
	
	// TreeSet : In Order print
	TreeSet ts = new TreeSet();
	for(char d :c) {
		ts.add(d);
	}
	System.out.println(ts);

	}
}
