import java.util.*;
public class Utility {

	public static void main(String[] args) {

		Calendar objCalender = Calendar.getInstance();
		//display Date and Time components
		System.out.println("\n Date and Time Components");
		System.out.println("Year:" +objCalender.get(Calendar.YEAR));
		System.out.println("Month:" +objCalender.get(Calendar.MONTH));
		System.out.println("Date:" +objCalender.get(Calendar.DATE));
System.out.println("Hour:"+objCalender.get(Calendar.HOUR));
objCalender.add(Calendar.MINUTE, 30);

System.out.println("\nDate and Time");
	}

}
