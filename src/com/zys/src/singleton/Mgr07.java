package com.zys.src.singleton;

/**
 * 静态内部类
 * JVM保证单例,外部类被加载时，内部类不会被加载
 * 虚拟机加载class时，只加载一次
 * 加载外部类时不会加载内部类，这样可以实现懒汉式加载
 * */
public class Mgr07 {

	private static class Mgr07Holder {
		private static Mgr07 INSTANCE = new Mgr07();
	}
	
	private Mgr07() {
	}
	
	public static Mgr07 getInstance() {
		return Mgr07Holder.INSTANCE;
	}
}
