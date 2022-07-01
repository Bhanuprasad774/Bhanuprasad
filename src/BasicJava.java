import java.util.Scanner;
public class BasicJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number");
	num1=sc.nextInt();

	System.out.println("enter the second number");
	num2 = sc.nextInt();

	
	
System.out.println("Arithmetic operations of the two numbers");
System.out.println("addition of the numbers is :" +(num1 +num2));
System.out.println("subtraction of the numbers is :"+(num1-num2));
	}
	

}
