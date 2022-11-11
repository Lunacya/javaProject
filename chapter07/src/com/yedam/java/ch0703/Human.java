package com.yedam.java.ch0703;

public class Human {

	// 필드
	// 이름, 키, 몸무게
	public String name;
	public int height;
	public int weight;
	public double avgwe;

	// 생성자
	public Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}

	// 메소드
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
}
