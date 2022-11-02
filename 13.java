class Th implements Runnable {
	Thread thread;
	String tn;
	int pri;

	Th(String s, int i) {
		tn = s;
		pri = i;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(thread.getName() + ", " + thread.getPriority() + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Exception in thread: " + tn);
		}
		System.out.println("Thread " + tn);
	}

	public void start() {
		if (thread == null) {
			thread = new Thread(this, tn);
			thread.setPriority(pri);
			thread.setName(tn);
			System.out.println("Start method " + thread.getName());
			thread.start();
		}
	}
}

public class Main {
	public static void main(String args[]) {
		Th thread1 = new Th("First Thread", 4);
		thread1.start();

		Th thread2 = new Th("Second Thread", 6);
		thread2.start();
	}
}