package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr04;

public class Mgr04Verifiction {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> System.out.println(Mgr04.getInstance().hashCode())).start();
		}
	}
}
