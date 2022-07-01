public interface Display{
	public int show(int a);
}
public class Lambda {

	public static void main(String[] args) {
	
Display display = (int a) -> a;
System.out.println("return value from lambda expression = " +display.show(100));

	}

}
