package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr06;

public class Mgr06Verifiction {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> System.out.println(Mgr06.getInstance().hashCode())).start();
		}
	}
}
