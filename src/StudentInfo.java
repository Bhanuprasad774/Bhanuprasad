class StudentInfo


{
int regNumber;
String StudentName;

StudentInfo(int reg_no,String Name){
	
this.regNumber = reg_no;
this.StudentName=Name;
}
public class StudentInfoMain{

	

	public void main(String[] args) {
	
		
		StudentInfo []arr;
	arr = new StudentInfo[5];
	arr[0] = new StudentInfo(123,"Manish");
	arr[1] = new StudentInfo(1234,"Bhanu");
	arr[1] = new StudentInfo(12345,"Bh");
	arr[1] = new StudentInfo(123456,"Bhan");
	arr[1] = new StudentInfo(1234567,"Bha");

	for (int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	
	for (int i = 0;i<arr.length;i++)
	System.out.println("student with registration number"+arr[i].regNumber+ "is:"+arr[i].StudentName);
	
	
	
	

	}

}
}