import java.util.StringTokenizer;
import java.util.Scanner;
public class UtilityPackage {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any sentence ?");
		String userString =sc.nextLine();
		StringTokenizer st = new StringTokenizer(userString," ");
		System.out.println(st);
		System.out.println("\nVowel count for each word in given string are");
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("processing word :" + word);
		
			int VowelCount = 0;
			for (char c: word.toCharArray()) {
			c =Character.toLowerCase(c);
			if (c =='a'||c =='e'||c =='i'||c=='o'||c=='u') {
				VowelCount++;
			}
		}
		
	
System.out.println("The word" + "word" + "has"  + VowelCount + "Vowels");	
	}

	}}
