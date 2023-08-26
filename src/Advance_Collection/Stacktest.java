package Advance_Collection;

import java.util.Stack;
public class Stacktest {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(31);
		s.add(10);
		s.add(16);
		System.out.println(s);
		s.pop();  // remove top (last added )of the element
		System.out.println(s);
		s.push(50);  // added element on the top of stack means last
		System.out.println(s);
		System.out.println(s.peek()); // tells the top of the value of element
		

	}

}
