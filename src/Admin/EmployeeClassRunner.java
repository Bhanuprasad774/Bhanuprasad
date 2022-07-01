package Admin;
import transport.Employee;

class person {
	public String name;
	public int age;
	public void print () {
		System.out.println("Name"+this.name+"age");
		
	}
}
public class EmployeeClassRunner {
	public static void main(String[]args) {
		Employee obj = new Employee();
		obj.show ();
	}

}
