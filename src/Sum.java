class Sum {
	static int add(int x, int y) {
		return x + y ;
		
	}
	static int add (int x,int y,int z) {
		return x + y + z;
	}
}
class Overloading1{
	public static void main(String[] args) {
	
System.out.println(Sum.add(10, 21));
System.out.println(Sum.add(21, 11, 11));
	}

}
