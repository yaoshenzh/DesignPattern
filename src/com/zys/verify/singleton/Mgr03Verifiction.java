package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr03;

public class Mgr03Verifiction {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
		}
	}
}
