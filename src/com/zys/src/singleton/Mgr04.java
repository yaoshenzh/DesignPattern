package com.zys.src.singleton;

public class Mgr04 {
	
	private static Mgr04 INSTANCE;
	
	private Mgr04() {
	
	}
	
	public static synchronized Mgr04 getInstance() {
		
		if (INSTANCE == null) { 
			// thread 1 come here, notice it's null.suspend, then thread 2 come here, notice it's null.
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			INSTANCE = new Mgr04();
		}
		
		return INSTANCE;
	}
}
