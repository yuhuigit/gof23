package com.secbro2.others.testVolatile;

/**
 * @author zzs
 */
public class Counter {

	private volatile int inc = 0;

	/**
	 * Thread safe;
	 */
	private synchronized void increase() {
		inc++;
	}

	/**
	 * Not Thread safe;
	 */
	/*private  void increase() {
		inc++;
	}*/

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 1000; j++) {
					counter.increase();
				}
			}).start();
		}

		Thread.sleep(3000L);

		System.out.println(counter.inc);
	}
}
