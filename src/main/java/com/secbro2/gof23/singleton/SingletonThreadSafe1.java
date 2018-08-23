package com.secbro2.gof23.singleton;

/**
 * Singleton Patterns<br/>
 * <p>
 * Double checked lock;
 *
 * @author zzs
 */
public class SingletonThreadSafe1 {

	private static SingletonThreadSafe1 instance;

	private SingletonThreadSafe1() {
	}

	public static SingletonThreadSafe1 getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafe1.class) {
				if (instance == null) {
					instance = new SingletonThreadSafe1();
				}
			}
		}

		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello SingletonThreadSafe1!");
	}
}
