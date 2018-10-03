package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//This class' object is used as key in the HashMap
class Key 
{
	private int index;
	public String Name;

	Key(int index, String Name) {
		this.index = index;
		this.Name = Name;
	}

	@Override
	public int hashCode() {
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

public class MapTest1 {

	public static void main(String[] args) {

		Map<Key, String> cityMap = new HashMap<Key, String>();
		cityMap.put(new Key(1, "NY"), "New York City");
		cityMap.put(new Key(2, "ND"), "New Delhi");
		cityMap.put(new Key(3, "NW"), "Newark");
		cityMap.put(new Key(4, "NP"), "Newport");

		System.out.println("size before iteration " + cityMap.size());
		Iterator<Key> itr = cityMap.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(cityMap.get(itr.next()));
		}
		System.out.println("size after iteration " + cityMap.size());
		
		// What will be the output of the code?
		
	}

}


