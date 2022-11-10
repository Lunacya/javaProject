package com.yedam.java.ch0605;

public class Singleton {

	// 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딕 기법
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return singleton;
		// singleton = new Singleton();
	
	}
}
