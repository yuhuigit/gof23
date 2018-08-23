package com.secbro2.gof23.singleton;

/**
 * Enum Singleton Patterns
 *
 * @author zzs
 */
public enum EnumSingleton {

	INSTANCE;

	public void helloSingleton() {
		System.out.println("Hello HungrySingleton!");
	}
}
