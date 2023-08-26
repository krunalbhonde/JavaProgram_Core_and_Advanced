package Advance_Collection;

import java.util.Collections;
import java.util.ArrayList;
public class ReverseArrayList {

	public static void main(String[] args) {
		//Program for how to reverse the element in arraylist in java

		int a[] = {1,2,3,4,5,6,7,8,9};
		
		  ArrayList<Integer> list = new ArrayList<Integer>();
	   for(int i : a) {
		   list.add(i);
	   }
		  /*  list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(8);
	      list.add(3);
	      list.add(9);*/
	      System.out.println("Original list : " + list);
	      Collections.reverse(list); // reversing the list
	      System.out.println("Reversed list : " + list);
	   }
	}