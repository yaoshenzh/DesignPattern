package com.zys.src.singleton;

/**
 * 饿汉式
 * 类加载到内存后，实例化一个对象，JVM保证线程安全
 * 缺点：不管该单例用到与否，类装在时完成实例化
 * 如果我不用，没必要装载
 */
public class Mgr01 {
	
	private static final Mgr01 INSTANCE = new Mgr01();
	
	private Mgr01() {
		
	}
	
	public static Mgr01 getInstance() {
		return INSTANCE;
	}
}
