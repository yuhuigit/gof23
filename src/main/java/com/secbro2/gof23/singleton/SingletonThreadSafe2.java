package com.secbro2.gof23.singleton;

/**
 * Singleton Patterns<br/>
 * <p>
 * Double checked lock and volatile;
 *
 * @author zzs
 */
public class SingletonThreadSafe2 {

	private static volatile SingletonThreadSafe2 instance;

	private SingletonThreadSafe2() {}

	public static SingletonThreadSafe2 getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafe2.class) {
				if (instance == null) {
					instance = new SingletonThreadSafe2();
				}
			}
		}

		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello SingletonThreadSafe1!");
	}
}
