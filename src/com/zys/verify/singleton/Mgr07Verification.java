package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr07;

public class Mgr07Verification {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> System.out.println(Mgr07.getInstance().hashCode())).start();
		}
	}
}
 