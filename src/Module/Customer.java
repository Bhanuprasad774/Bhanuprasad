package Module;

public abstract class Customer{
String Customername;
String CustomerId;
String Customertype;

Customer(String custname,String custId,String custtype){
	this.Customername = Customername;
	this.CustomerId = CustomerId;
	this.Customertype = Customertype;
}

void showCustomerDetailis() {
System.out.println("CustomerId:"+this.CustomerId);
System.out.println("Customername:"+this.Customername);
System.out.println("Customertype:"+this.Customertype);
}
abstract double get_final_amount(int year,double interest);
}
