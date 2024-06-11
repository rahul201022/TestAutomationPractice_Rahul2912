package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//Map map = new HashMap();
		HashMap<Object,Object> map = new HashMap<Object, Object>();
		//HashMap map = new HashMap();
		map.put(1, "Rahul");
		map.put(2, "Mistry");
		map.put(3, 100);
		
		//Size of Map
		System.out.println(map.size());
		//Print Map list
		System.out.println(map);
		//Remove any one pair
		map.remove(2);
		System.out.println("After remove: "+map);
		//access value of particular key
		System.out.println(map.get(1));
		
		//get all key from map 
		System.out.println("Get all key: "+map.keySet());
		
		//get all key values from map 
		System.out.println("Get all values: "+map.values());
		
		//Get Key and Value both from map
		map.put(2, "Mistry");
		System.out.println("Get all key&Values: "+map.entrySet());
		
		//Get list using enhance loop
		for(Object obj:map.keySet()) {
			System.out.println(obj+"   "+map.get(obj));
		}
		
		//using iterator
		Iterator<Entry<Object,Object>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Entry<Object,Object> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
