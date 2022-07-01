package collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList <String> animal = new LinkedList<String>();
	animal.offer("Dog");
	animal.offer("Cat");
	animal.offer("Lion");
	
	animal.add("Elephant");
	
	
	
	//System.out.println(animal.getLast());//require linkedlist
	//System.out.println(animal.remove());
	//System.out.println(animal);
	//System.out.println(animal.peek());
	//System.out.println(animal.poll());// return and remove the element at the head/the first element of the queue
	//System.out.println(animal);
	
	//element() returns the first element.if the queue is
	//empty then an exception is raised.
	
	System.out.println(animal.element());
	
	List<String> animal1 = new LinkedList<>();
		}

	}



