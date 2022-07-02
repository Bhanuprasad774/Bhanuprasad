package WaitAndNotify;

public class Thread1 {

	public static void main(String[] args) {
		
		
		Thread2 thread2 = new Thread2();
		thread2.start();
		
		System.out.println("thread2 is waiting to complete");
		
	
		synchronized(thread2) {
		
		try {
			thread2.wait();
		
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("total is:" +thread2.total);

	}

}
class Thread2 extends Thread {
	int total;
	public void run() {
		synchronized(this) {

	
		for (int i=0;i<=100;i++) {
			
			total+= i;
	}
		
		
		notify();
		//System.out.println("total:" + total);
}}}}