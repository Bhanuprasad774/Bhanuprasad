package Admin ;

public class person {
 String Name;
 int age;

public person(){ 
	System.out.println("parent no arg constructer called");
}

		
public person(String Name,int Age){
	this.name = Name;
	this.Age = Age;
	
}
	
 String name;
	 int Age;
	
	 void print() { 
		System.out.println("Name:" + this.name + "age");
		
	}

}
