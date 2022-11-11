package com.yedam.java.ch0701;

public class Member extends People {

	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn);
		// super : 부모 클래스(People)에서 자식 클래스(Member)로 부르는 명령어
		this.stdNo = stdNo;
	}

	
}
