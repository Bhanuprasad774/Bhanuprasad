import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		
				int n;
				while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("who is the founder of the Blue Origin");
				System.out.println("1.Bill Gates\n2 Bhanu\n3 Teja\n4 Jeff Bezos\n5 Exit program");
				System.out.println("print ur choice 1/2/3/4");
				n=sc.nextInt();
				if (n==4) {
					System.out.println("congo ur ri8");
					break;}
				
				else if( n==5) {
				break;
									
				}
				else {
					System.out.println("ur wrong,Better luck next time");
					
				}
					
			}

		}


	}


