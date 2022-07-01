package UserMenu;
import java.util.Scanner;
public class UserMenuClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int selection =1;
		while(selection!=4) {
		System.out.println("Choose from these options");
		System.out.println("1.add a user specified field");
		System.out.println("2. delete a user specified field");
		System.out.println("3.search a user specified field");
		System.out.println("4. Quit");
		
		 selection = input.nextInt();
		
		
		
		switch(selection) {
		case 1:
			System.out.println("case 1 selected");
			break;
		case 2 :
			System.out.println(" option 2 selected");
			break;
		case 3:
			System.out.println(" option 3 selected");
			break;
		case 4:
			System.exit(0);
			default:
				System.out.println("wrong option");
				
			
			
		}
		
		
	}

	}}
