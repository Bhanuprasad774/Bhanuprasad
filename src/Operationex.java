
public class Operationex {
int v = 500;
void change(int v) { 
	v = v + 100;//changes will be made in local variable only
}	

public static void main(String []args) {
	Operationex o = new Operationex();
	System.out.println("before making change " + o.v);
	o.change(500);
	System.out.println("after change made " + o.v);
	
	
}
}
