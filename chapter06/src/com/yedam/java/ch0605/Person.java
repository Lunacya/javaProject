package com.yedam.java.ch0605;

public class Person {

	final String nation = "korea";
	final String ssn; // ssn = 미국 주민번호
	String name;
	
	// 국적과 주민번호는 변경 불가, 이름은 변경 가능.
	// 그래서 국적과 주민번호 앞에 final
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
