package com.secbro2.gof23.singleton;

/**
 * Hungry Singleton Patterns
 *
 * @author zzs
 */
public class HungrySingleton {

	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello HungrySingleton!");
	}
}
