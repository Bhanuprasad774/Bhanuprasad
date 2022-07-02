package multiThreading;

class Thread1 extends Thread{
	
	public void run() {
		System.out.println("Thread1 is running");
		
		for (int i=0;i<100;i++) {
			System.out.println(i +" ");
		}
		
		System.out.println("thread1 is done");
	}
	
}

class Thread2 implements Runnable{
	public void run() {
		System.out.println("Thread2 is running");
		
		for (int i = 10;i<200;i++) {
			System.out.println(i +" ");
			
			
		}
		System.out.println("thread2 is done");
	}
}

//class Thread3 implements Runnable {
//	@Override
	
//	public void run() {
//System.out.println("Thread3 is running");
		
	//	for (int i = 200;i<300;i++) {
		//	System.out.println(i +" ");
			
			// this a type if checked exception
	//		try {
		//		Thread.sleep(1000);
				
		//	} catch (InterruptedException e) {
				
			//	e.printStackTrace();
		//	}
//	}
	//	System.out.println("thread3 is done");

//	}
	
	
	
	

public class ThreadRunner {
	
	public static void main(String[]args) {
		
		Thread1 thread1 = new Thread1();
		
	Thread2 t2 = new Thread2();
	
	
	Thread thread2 = new Thread(t2);
	
	//Thread3 t3 =new Thread3();
//	Thread thread3 = new Thread(t3);
	thread1.start();
	thread2.start();
	//thread3.start();
	//thread3.interrupt();
	
	
	}

}
