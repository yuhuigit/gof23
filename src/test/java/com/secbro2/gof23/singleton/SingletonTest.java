package com.secbro2.gof23.singleton;

import org.junit.Test;

/**
 * @author zzs
 */
public class SingletonTest {

	@Test
	public void testHungrySingleton(){
		HungrySingleton hungrySingleton = HungrySingleton.getInstance();
		hungrySingleton.helloSingleton();
	}

	@Test
	public void testSingleton() {
		Singleton singleton = Singleton.getInstance();
		singleton.helloSingleton();
	}

	@Test
	public void testThreadSafeSingleton() {
		SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
		singleton.helloSingleton();
	}

	@Test
	public void testThreadSafeOptimizedSingleton() {
		SingletonThreadSafe1 singleton = SingletonThreadSafe1.getInstance();
		singleton.helloSingleton();
	}

	@Test
	public void testInnerClassSingleton(){
		InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
		innerClassSingleton.helloSingleton();
	}

	@Test
	public void testEnumSingleton(){
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		enumSingleton.helloSingleton();
	}
}
