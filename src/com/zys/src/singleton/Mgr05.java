package com.zys.src.singleton;

public class Mgr05 {
	
	private static Mgr05 INSTANCE;
	
	private Mgr05() {
	
	}
	
	public static Mgr05 getInstance() {
		
		if (INSTANCE == null) { 
			// thread 1 come here, notice it's null.suspend, then thread 2 come here, notice it's null.
			
			synchronized (Mgr05.class) {
				// try lock smaller scope
				// in stead of lock the whole class, only lock this piece of code.
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				INSTANCE = new Mgr05();
			}
		}
		
		return INSTANCE;
	}
}