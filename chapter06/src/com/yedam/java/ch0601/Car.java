package com.yedam.java.ch0601;

public class Car {
	//필드 : 일종의 속성
	int maxSpeed = 100;
	String color = "red";
	
	//생성자 : Class와 이름이 같다. 본인 이름X
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	//메소드 : 동작. 본인 고유의 이름이 존재. return되는 값이 필요.
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
	
}
