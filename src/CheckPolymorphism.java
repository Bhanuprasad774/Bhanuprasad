
public class CheckPolymorphism {
	public static void main(String[] main) {
	HouseArchitecture ha;
	
	ha = new Villa();
	System.out.println("Enter the value of the villa:"+Stringformat("%.of"+ ha.getprice()));
	System.out.println("loan given by the bank:"+Stringformat("%.of"+ha.getloan));
	
	ha = new Apartment();
	System.out.println("enter the value of the apartment:"+Stringformat("%.of"+ha.getprice));
	System.out.println("loan given by the bank:"+Stringformat("%.of"+ha.getloan));

}

}
