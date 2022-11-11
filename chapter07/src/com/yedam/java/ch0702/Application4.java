package com.yedam.java.ch0702;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		// c ▶ b 상속 관계
		// b ▶ a 상속 관계
		// c ▶ b ▶ a 상속 관계
		
		// a는 가장 상위 상속자
		A a1 = b;
		A a2 = c;
	}

}
