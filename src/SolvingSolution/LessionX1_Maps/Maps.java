package SolvingSolution.LessionX1_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * HashMap : no guarantees about the iteration order, can completely change when new elements are added
 * SortedMap : Sorted by Key
 * TreeMap : sorted, it implemented SortedMap interface
 * LinkedHashMap : iterate in the order in which the entries were put into the map
 * HashTable : obsolete
 */
public class Maps {
	public static void HashMap_demo() {
		Map<Integer, String> color = new HashMap<Integer, String>();
		color.put(1, "White");
		color.put(2, "Red");
		color.put(3, "Blue");
		color.put(4, "Green");
		color.put(5, "Black");
		
		IteratorPrinting(color);
//		for (Map.Entry<Integer, String> entry : color.entrySet()) {
//			System.out.println(entry.getKey() + " | " + entry.getValue());
//		}
	}
	
	public static void TreeMap_demo() {
		Map<Integer, String> color = new TreeMap<Integer, String>();
		color.put(4, "Green");
		color.put(1, "White");
		color.put(2, "Red");
		color.put(5, "Black");
		color.put(3, "Blue");
					
		IteratorPrinting(color);
	}
	
	public static void IteratorPrinting (Map<Integer, String> map) {
		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> pair = (Entry)it.next();
			System.out.print(pair.getKey() + " - " + pair.getValue() + " * ");
			it.remove();
		}
		System.out.println();
	}
	public static void main (String[] args) {
		HashMap_demo();
		TreeMap_demo();
	}
}
