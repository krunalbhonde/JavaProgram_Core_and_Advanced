package Advance_Collection;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class DecendingChar {
		// Write down the program to print character in descending order of their frequency
	// Java implementation of the approach
	
	// Function to print the characters
	// of the given String in decreasing
	// order of their frequencies
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		int len = str.length();

		printChar(str.toCharArray(), len);
	}
	
	public static void printChar(char []a, int len)
	{
		// To store the
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < len; i++)
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
			{
				map.put(a[i], 1);
			}

		// Map's size
		int size = map.size();
		// While there are elements in the map
		while (size-- > 0)
		{
			// Finding the maximum value
			// from the map
			int currentMax = 0;
			char arg_max = 0;
			for (Map.Entry<Character,
							Integer> it : map.entrySet())
			{
				if (it.getValue() > currentMax ||
				(it.getValue() == currentMax &&
					it.getKey() > arg_max))
				{
					arg_max = it.getKey();
					currentMax = it.getValue();
				}
			}

			// Print the character
			// alongwith its frequency
			System.out.print(arg_max + " - " +
							currentMax + "\n");

			// Delete the maximum value
			map.remove(arg_max);
		}
	}

	// Driver code

	}

	