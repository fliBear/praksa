package counter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class counter {
	
	public static void main(String[] args) {
		//Convert all arguments to a single string and remove whitespace characters
		String argument = new String();
		for(String s : args) {
			argument = argument + s.toLowerCase();
		}
		argument.replace("\\s", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//Count letters
		for(Character c : argument.toCharArray()) {
			if(map.containsKey(c)) {
				int currentCount = map.get(c);
				map.put(c, currentCount + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		//Output results
		System.out.println("Counted letters:");
		for(Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}

}
