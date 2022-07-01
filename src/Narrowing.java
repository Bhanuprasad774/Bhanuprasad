import java.util.Scanner;
public class Narrowing {
public static void main(String[]arg) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter an Integer value: ");
	int v = s.nextInt();
	char c = (char) v;
	System.out.println("Character value of the given Integer: "+c);
	
}
}
