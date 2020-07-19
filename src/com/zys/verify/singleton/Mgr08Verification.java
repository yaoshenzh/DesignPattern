package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr08;

public class Mgr08Verification {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> System.out.println(Mgr08.INSTANCE.hashCode())).start();
		}
	}
}
 