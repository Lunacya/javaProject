package com.yedam.java.ch0703;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다~!");
	}
	// 중요함
	public abstract void sound();
}
