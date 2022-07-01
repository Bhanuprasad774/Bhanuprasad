package IT;

import Admin.person;

public class Employee extends person {
	private int empId;
	private String Dept;
	
	public Employee(String name,int empId,int age,String Dept){
		
		super(name,age);
		
		this.empId = empId;
		this.Dept = Dept;
	}
	

	
void setempId(int empId) {
	this.empId = empId;
	 

}
void setNameAndAge(String Name) {
	
}
void setDept(String Dept) {
this.Dept = ("IT");
}

void show() {
	print();
	System.out.println("EmpId "+this.empId +"dept");
	
}

 class second{
	 void setValue () {
		 Employee obj = new Employee("Bhanu",23,100,"IT");
		 // obj.empId = 100; 
		 obj.setempId(100);
		 obj.setDept("IT");
		 
				 
		 obj.show();
	 }
 }}
