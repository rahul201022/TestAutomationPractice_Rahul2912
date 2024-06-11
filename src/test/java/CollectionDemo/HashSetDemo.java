package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		//declaration of Hashset
		//Set set = new HashSet();
		//HashSet<String> set = new HashSet<String>();
		HashSet<Object> set = new HashSet<Object>();
		set.add(50);
		set.add("Rahul");
		set.add('T');
		set.add(20.5);
		set.add(50);
		set.add(false);
		set.add(10);
		
		//Print set list
		System.out.println(set);
		//size of set list
		System.out.println(set.size());
		//remove element from set list
		set.remove("Rahul"); // Mentioned direct value because index not support
		System.out.println(set);
		
		//For insert an element direct no possible so convert Hashset in arraylist
		//Convert Hashset-->ArrayLisst
		
		ArrayList<Object> list = new ArrayList<Object>(set);
		list.add(1,"Rahul");
		System.out.println(list);
		
		//Get set list using for loop not possible because we dont know index for starting and ending element
		//Get set list enhance for loop
		for(Object obj:set) {
			System.out.println("Get list: "+obj);
		}
		
		//Get set list using Iterator
		
		Iterator<Object> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Is set list empty or not 
		System.out.println("is set list empty ? :"+set.isEmpty());
		set.removeAll(set);
		System.out.println("is set list empty ? :"+set.isEmpty());
	}

}
