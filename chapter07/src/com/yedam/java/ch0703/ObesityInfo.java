package com.yedam.java.ch0703;

public class ObesityInfo extends StandardWeightInfo {
	
	// 생성자
	public ObesityInfo(String n, int h, int w) {
		super(n, h, w);
	}
	
	// 메소드
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
//	public double getObesity() {
//		// 비만도 : obewe
//		double obewe = ((weight - 100) * 0.9);
//	}

}
