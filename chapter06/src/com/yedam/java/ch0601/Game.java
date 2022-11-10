package com.yedam.java.ch0601;

public class Game {

	// 필드
	// 객체로 만든다(인스턴스화로 된다)
	// 인스턴스 필드
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;

	// 생성자
	public Game() {

	}

	public Game(String id) {
		this.id = id;
	}

	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}

	// 메소드
	// 인스턴스 메소드
	void getInfo() {
		System.out.println("gameName : " + gameName);
		System.out.println("id : " + id);
		System.out.println("passWd : " + passWd);
	}
	void getInfo(String temp) {
		
	}
}
