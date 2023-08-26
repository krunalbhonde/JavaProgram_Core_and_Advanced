package Advance_Collection;
import java.util.HashMap;
public class MapTest {

	public static void main(String[] args) {
		// Basic Map Function
		//HashMap
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ashwini");   // put =  to add the element
		map.put(2, "Amol");
		map.put(3,  "Krunal");
		map.put(3, "Satish");
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Ash"));
		

	}

}
