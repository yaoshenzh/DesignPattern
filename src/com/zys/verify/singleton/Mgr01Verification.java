package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr01;

public class Mgr01Verification {

	public static void main(String[] args) {
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
