package com.zys.src.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化,enum没有构造方法
 */

public enum Mgr08 {
	INSTANCE;
}
