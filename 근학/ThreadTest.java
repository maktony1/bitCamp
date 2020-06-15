class ThreadWithClass extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		  try {
			  Thread.sleep(10);
		  }catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
	}
	}
}

class ThreadWithRunnable implements Runnable {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				 e.printStackTrace();
			}
		}
	}
}



public class ThreadTest {

	public static void main(String[] args) {
	 
		ThreadWithClass thread1 = new ThreadWithClass();
		Thread thread2 = new Thread(new ThreadWithRunnable());
		
		thread1.start();
		thread2.start();
		
	}
}


