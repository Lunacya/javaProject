package com.yedam.java.ch0701;

import com.yedam.java.ch07.Parent; // 패키지 ch07의 Class를 부모로 모심.

public class Child2 extends Parent {

	// 필드

	// 생성자

	// 메소드

	void getInfo() {
		//System.out.println(firstName + lastName + bloodType + age);
	}
	//에러 뜨는 애들은(age) default 타입.
	// protected를 사용하고 부모 자식 간의 성립이 된다면, 다른 패키지에 있는 class라도 쓸 수 있다.
	// public도 쓸 수 있다. 
}
