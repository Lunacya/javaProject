package com.yedam.java.ch0701;

public class Child extends Parent {

	// 필드
	public String lastName;
	public int age;
	// 생성자

	// 메소드

	@Override
	public void method1() {
		System.out.println("Child 클래스 재정의 된 method1 호출");
	}

	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
}
