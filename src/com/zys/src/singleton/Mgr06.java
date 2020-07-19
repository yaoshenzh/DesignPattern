package com.zys.src.singleton;

public class Mgr06 {
	
	private static volatile Mgr06 INSTANCE; //JIT
	
	private Mgr06() {
	
	}
	
	public static Mgr06 getInstance() {
		
		if (INSTANCE == null) { 
			
			synchronized (Mgr06.class) {

				if (INSTANCE == null) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					INSTANCE = new Mgr06();
				}
			}
		}
		
		return INSTANCE;
	}
}