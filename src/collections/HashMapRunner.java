package collections;
import java.util.HashMap;
public class HashMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

	
	
	
	map.put(1,  "one");
	map.put(2,  "two");
	map.put(2,  "twoo");
	map.put(2,  "twooooo");
	
	map.replace(2, "to");
	
	
	//System.out.println(map.keySet());
	//System.out.println(map.values());
	
	HashMap <Student,Integer> students = new HashMap <Student, Integer>();
	Student std1 = new Student("ABC",20,1,"phase1");
	Student std2 = new Student("ABC",20,2,"phase1");
	
	Student std3 = new Student("ABCD",20,1,"phase1");
	
	students.put(std1,1);
	students.put(std2, 2);
	students.put(std3, 3);
	
	System.out.println(students);
	
	
	for(Student std: students.keySet());
	System.out.println();
	
	
	
	
	
	
	}

}
