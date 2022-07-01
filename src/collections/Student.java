package collections;

public class Student {
	String name;
	int age;
	String Course;
	
	
	
	public Student(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.Course = course;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCourse() {
		return Course;
	}



	public void setCourse(String course) {
		Course = course;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", Course=" + Course + "]";
	}
	
	public int hashCode() {
		System.out.println("hashcode is called");
		return this.RollNo;

}
	public boolean equals(obj) {
		System.out.println("equal is called");
		
	Student other = (Student)obh;
	return other.rollNo ==this.RollNo;
		
		
		
		
		
		
	}
}