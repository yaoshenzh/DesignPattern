package com.zys.src.singleton;

/**
 * Lazy Loading
 * 多线程访问会有影响
 */
public class Mgr03 {
	private static Mgr03 INSTANCE;
	
	private Mgr03() {
	
	}
	
	public static Mgr03 getInstance() {
		
		if (INSTANCE == null) { 
			// thread 1 come here, notice it's null.suspend, then thread 2 come here, notice it's null.
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			INSTANCE = new Mgr03();
		}
		
		return INSTANCE;
	}
	
}
