package collections;

import java.util.*;

public class ArraylistRunner {
	public static void main(String[]args) {

	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	arraylist.add(12);
	
	// System.out.println(arraylist.size());
	arraylist.add(20);
	arraylist.add(30);
	
	arraylist.set(2, 40);
	arraylist.remove(0);
	System.out.println(arraylist);
	
	
	//way of iteration is looping through or 
	//accessing all the elements of arraylist
	
	
	for(int i=0; i< arraylist.size();i++) {
		System.out.println(arraylist.get(i));
	}
	
	ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
	arraylist1.add(200);
	
	Iterator it = arraylist.iterator();
	Iterator it1 = arraylist1.iterator();
	
	while(it1.hasNext()) {
		System.out.println(it.next());
		System.out.println(it1.next());
	}
	
	

	 
	
	
}
}