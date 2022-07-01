import java.util.Scanner;
public class QuizProgram {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("who is the founder of the Blue Origin");
		System.out.println("1.Bill Gates\n2 Bhanu\n3 Teja\n4 Jeff Bezos");
		System.out.println("print ur choice 1/2/3/4");
		n=sc.nextInt();
		if (n==4) {
			System.out.println("congo ur ri8");
		}
		else {
			System.out.println("ur wrong,Better luck next time");
			
		}
			
	}

}
