package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr05;

public class Mgr05Verifiction {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> System.out.println(Mgr05.getInstance().hashCode())).start();
		}
	}
}
