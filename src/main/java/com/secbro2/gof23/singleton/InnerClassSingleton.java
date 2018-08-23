package com.secbro2.gof23.singleton;

/**
 * Singleton Patterns<br/>
 * <p>
 * Inner Class Singleton;
 *
 * @author zzs
 */
public class InnerClassSingleton {

	private InnerClassSingleton() {
	}

	private static class InnerClassSingletonHolder {
		public static InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonHolder.instance;
	}

	public void helloSingleton() {
		System.out.println("Hello Singleton!");
	}
}
