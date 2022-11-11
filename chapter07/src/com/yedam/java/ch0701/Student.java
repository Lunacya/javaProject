package com.yedam.java.ch0701;

public class Student {

	// 메소드
	public void setScore() {
		System.out.println("성적을 입력합니다.");
	}
	
	//     ▼ 자식 클래스에서 사용하지 못함.
	public final void getScore() {
		System.out.println("성적을 출력합니다.");
	}
}
