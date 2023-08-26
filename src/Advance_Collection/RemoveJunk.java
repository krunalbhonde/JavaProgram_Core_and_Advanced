package Advance_Collection;

public class RemoveJunk {

	public static void main(String[] args)   
	{  

		 
	String str= "This#string%contains^(*&^%$#[]<>special*//characters&.";   
	str = str.replaceAll("[^a-zA-Z0-9]", " ");
	String s = str.replaceAll("\\s+", " ");
	System.out.println(s);  
}
}