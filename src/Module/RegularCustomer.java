


package Module;
public abstract class RegularCustomer extends Customer{
String Customername;
String CustomerId;
String Customertype;
double amount;


RegularCustomer(String Custname,String Custtype,String CustId,double Custamt){
	super(CustId,Custname,Custtype);

this.Customername = Custname;
this.CustomerId = CustId;
this.Customertype = Custtype;
this.amount =Custamt;
}

double get_final_amount(double interest,int year) {
	double simple_interest =(this.amount*interest*year);
	double amount = (this.amount*simple_interest);
	
// for small scale people
	amount =amount-500;
	if (this.Customertype == "Domestic") {
	return amount-100;
	}
	
	else 
		if (this.Customertype == "Business") {
			return amount;
		}
	return amount;
	}


}

