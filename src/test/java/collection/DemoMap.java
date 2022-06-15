package collection;

import java.util.HashMap;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args)
	{
		HashMap map = new HashMap<>();
         map.put(21, "hello");
         map.put(29, "hi");
         map.put(31, "hi");
         map.put(2, "null");
         map.put(22, "null");     //map.put(22, "hi");
         map.put(23, "world");
         map.put(null, "bye");
         Set set = map.keySet();
         
         map.size();
         System.out.println(map.size());
         System.out.println(map.keySet()); //only key we will get 
         //System.out.println(map.get(map));
        // System.out.println(map);
         
	}

}
