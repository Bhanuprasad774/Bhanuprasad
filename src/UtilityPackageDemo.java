import java.util.*;
import java.util.function.*;


	
class MyConsumer <T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the number"+ctask);
		System.out.println("Adding 5 to the number is:"+((int)ctask +5));
		
	}
}

public class UtilityPackageDemo {
	public static void main(String[]arg) {
		ArrayList myList;
		MyConsumer mcons;
		myList = new ArrayList<>(5);
		mcons= new MyConsumer();
		myList.add(100);
		myList.add(200);
		myList.add(300);
		
		myList.forEach (mcons);
		
		
	}

	}	


