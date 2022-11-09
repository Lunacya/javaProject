package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	// 생성자
//	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		// class에 있는 필드값 자체를 수정하는 것이 아니다.
		// this는 인스턴스의 값을 가져옴.
		// this는 class를 건드리는게 아님.
		// this는 생성자와 메소드에서만 사용할 수 있다.
//	}

	public Car() {

	}

	public Car(String model) {
		//this.model = model;
		this(model, "은색", 250);
	}

	public Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model, color, 250);
		//▲ this는 반드시 가장 윗줄(첫줄)에만 호출 가능함.
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}