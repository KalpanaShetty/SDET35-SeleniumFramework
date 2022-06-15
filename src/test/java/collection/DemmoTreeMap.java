package collection;

import java.util.TreeMap;

public class DemmoTreeMap {

	public static void main(String[] args) {
		TreeMap map = new TreeMap<>();
		map.put(21, "hello");
        map.put(29, "hi");
        map.put(31, "hi");
        map.put(2, "null");
        map.put(22, "null");     //map.put(22, "hi");
        //map.put("name", "world");
       // map.put(null, "bye");
        System.out.println(map);
	}

}
