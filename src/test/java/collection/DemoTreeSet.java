package collection;

import java.util.Collections;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(9);
		set.add(9);
		set.add(16);
		set.add(1);
		set.add(19);
		set.add(2);
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		//Collections.sort(list); will not work for set
		
		/*try{
			System.out.println("try start");
			set.add(null);
			System.out.println("try 2");
			set.add("tyss");
			System.out.println("try end");
			}
		catch(Exception e){
			
		
				}*/
		//set.add('k');
		//set.add("tyss");
		//set.add(null);
		
	}

}
