
public class Temp{
	private double temp;
	public static double maxT = 0;
	public Temp(double t) {
		temp = t;
		if (t>maxT);
		maxT=t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Temp t1 = new Temp(55);
Temp t2 = new Temp(100);
Temp t3 = new Temp(101);
System.out.println("Max Temp:" + Temp.maxT);
	}

}
