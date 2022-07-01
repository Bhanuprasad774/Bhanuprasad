import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		n=sc.nextInt();
		
		int fact_var = 1;
		for (int i=1; i<=n; i++) {
		fact_var = fact_var*i;
		System.out.println("factorial of the number" +n+" is :"+fact_var);

	}

}}
