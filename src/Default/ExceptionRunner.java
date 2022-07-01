package Default;

public class ExceptionRunner{
	
	public static void main(String[]args) {
		
		
int x = 10;
int y = 10;

//int []arrr = new int [2];

//arr[3] = 3;

try {

System.out.println(x/y);
}



catch (Exception e) {
	System.out.println("Exception caught");
}
finally {
	System.out.println("always executed");
}
System.out.println("after exception");
	}}