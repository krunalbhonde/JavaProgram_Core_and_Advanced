package Advance_Collection;
import java.util.*;
import java.util.Iterator;

public class HashSetCkeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet<Integer> set = new HashSet<>();
	//	LinkedHashSet<Integer> set = new LinkedHashSet<>();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(4);
		System.out.print(set + " ");
		Iterator<Integer> its = set.iterator();
		System.out.println();
		while(its.hasNext()) {
			System.out.print(its.next() +" ");
		}
	}

}
