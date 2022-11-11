package com.yedam.java.ch0701;

public class DmbCellPhone extends CellPhone {
	
	//필드
	public int channel;
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		// 부모 클래스에 생성자가 구성되어 있지 않아, 자동으로 super(); 생략
		// 부모 클래스 필드
		this.model = model;
		this.color = color;
		// 자식 클래스 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	
}
