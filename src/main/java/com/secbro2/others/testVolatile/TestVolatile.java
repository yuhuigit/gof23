package com.secbro2.others.testVolatile;

/**
 * @author zzs
 */
public class TestVolatile {

	private static volatile boolean status = false;

	public static void main(String[] args) throws InterruptedException {

		new Thread(() -> {
			while (!status) {
			}
		}).start();

		Thread.sleep(100L);

		status = true;
		System.out.println("status is " + status);
	}
}

