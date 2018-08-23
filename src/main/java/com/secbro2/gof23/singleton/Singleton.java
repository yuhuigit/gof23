package com.secbro2.gof23.singleton;

/**
 * Singleton Patterns<br/>
 * <p>
 * Not Thread Safe;
 *
 * @author zzs
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello Singleton!");
	}
}
