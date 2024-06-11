package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		//List mylist = new ArrayList();
		//ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<Object> mylist = new ArrayList<Object>();
		
		mylist.add(200);
		mylist.add(40);
		mylist.add("Rahul");
		mylist.add('A');
		mylist.add(true);
		mylist.add(12.5);
		
		System.out.println("Size of an array list: "+mylist.size());
		System.out.println("Printing an array list: " +mylist.toString());
		//remove element from array list
		mylist.remove(1);
		System.out.println("After removed : " +mylist);
		
		//Insert an element from array list
		mylist.add(1, 25); // insert into first index
		mylist.add(12.5);
		System.out.println("After insertion : " +mylist);
		
		//Update/Change element in array list
		mylist.set(1, 50);
		mylist.set(5, 25.8);
		System.out.println("After updation : " +mylist);
		
		//get print any particular element from list
		System.out.println(mylist.get(2));
		
		//Reading all elements from array list
		//normal for loop
		
//		for(int i=0;i<mylist.size();i++) {
//			System.out.println("Get list by For loop: "+mylist.get(i));
//		}
		
		//Reading all elements from array list
		//Using enhance / for each loop
		
//		for(Object obj:mylist) {
//			System.out.println("Get list by enhance loop: "+obj);
//		}
		
		//Reading all elements from array list
		//Using interator
		
		Iterator<Object> it = mylist.iterator();
		
		while(it.hasNext()) {
			System.out.println("Using iterator: " +it.next());
		}
		
		//Check array list empty or not
	 	System.out.println("is list empty? :" +mylist.isEmpty());
	 	
	 	//remove all and then check empty or not
	 	mylist.removeAll(mylist);
		System.out.println("After remove all : " +mylist);
	 	System.out.println("is list empty? :" +mylist.isEmpty());
	 	
	}

}
