package com.secbro2.gof23.singleton;

/**
 * Singleton Patterns<br/>
 * <p>
 * Thread Safe;
 *
 * @author zzs
 */
public class SingletonThreadSafe {

	private static SingletonThreadSafe instance;

	private SingletonThreadSafe() {
	}

	public static synchronized SingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}

		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello SingletonThreadSafe!");
	}
}
