package com.zys.verify.singleton;

import com.zys.src.singleton.Mgr02;

public class Mgr02Verification {

	public static void main(String[] args) {
		Mgr02 m1 = Mgr02.getInstance();
		Mgr02 m2 = Mgr02.getInstance();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}

}
