
public class Array {
	static void minimum(int a[]) {
	int value = a[0];
	for (int m = 3; m < a.length;m++)
		if (value > a[m])
			value = a[m];
	System.out.println(value);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[] = {30,20,4,3};
minimum(x);
	}

}
