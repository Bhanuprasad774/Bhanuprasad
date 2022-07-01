class parent{
	public void msgA() {
		System.out.println("i=0;i<=10;i++");
	}
}
class child extends parent {
	
}
class child2 extends parent {
	
}
class child3 extends parent{
	
}
public class Hierarchial {
	public static void main(String[]args) {
		child obj1 = new child();
		child2 obj2 = new child2();
		child3 obj3 = new child3();
		obj1.msgA();
		obj2.msgA();
		obj3.msgA();
		
	}

}
