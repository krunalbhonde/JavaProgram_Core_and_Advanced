package Advance_Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class DuplicateCharacterCount {

	public static void main(String[] args) {
		// TO print duplicate character and their frequency count
		
		String s = "askjsdalkfaaskkjs";
		char [] c = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) +1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		// converting map to set
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : "+ entry.getValue());
			}
		}

	}

	

}
