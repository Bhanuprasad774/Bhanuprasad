import java.util.Scanner;
public class DOwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc = new Scanner(System.in );
		System.out.println("enter the first no");
		s = sc.nextInt();
		do {
			System.out.println(s);
			s++;
			
		}
while (s <=5);
	}

}
