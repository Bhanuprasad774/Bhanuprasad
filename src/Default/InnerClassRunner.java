package Default;

 class Outer {
	private int x = 10;
	
	class Inner{
		void show() {
			
			System.out.println("value of x: " + x);
		}
	}

}
public class InnerClassRunner {
	public static void main(String[]arg) {
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.show();
	}
}