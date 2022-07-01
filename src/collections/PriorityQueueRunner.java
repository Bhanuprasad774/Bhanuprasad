package collections;


import java.util.PriorityQueue;
import java.uti.Comparator;
import java.util.Iterator;

public class PriorityQueueRunner {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(4);
		
		numbers.add(2);
		numbers.add(5);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		
		numbers.add(8);
		
		numbers.add(6);
		
		numbers.add(0);
		
		
		//System.out.println(numbers.remove());
		//System.out.println(numbers.peek());
		
		
		
	//	System.out.println(numbers);
		
		Iterator it = numbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	//	for(int i=0; i<numbers.size(); i++) {
		//	System.out.println(numbers.peek());
			
//for (Integer e: numbers) {
	//System.out.println();
}
		
		
		/*
		 * PriorityQueue<String> cities = new PriorityQueue<String>();
		 * 
		 * cities.add("Calcutta"); cities.add("Agra"); cities.add("Bangalore");
		 * cities.add("Delhi");
		 * 
		 * cities.add("Andra");
		 * 
		 * System.out.println(cities);
		 * 
		 * cities.remove();
		 * 
		 * System.out.println(cities);
		 * 
		 * cities.remove();
		 * 
		 * System.out.println(cities);
		 */
		
		
		
		
		

	}




class NumberComparator implements Comparator<Integer>{

	
	public int compare(Integer number1, Integer number2) {
		System.out.println("compare called");
		if(number1 > number2) {
			return -1;
		}
		
		else if(number1 < number2) return 1;
		
		else return 0;
	}
	
}