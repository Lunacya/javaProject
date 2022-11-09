package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		// '생성자'를 호출
		Car car1 = new Car();
		// 내부의 속성값을 출력
		System.out.println("최대 스피트 : " + car1.maxSpeed);
		System.out.println("차 색깔 : " + car1.color);
		// 메소드 출력
		car1.run();

		System.out.println("=============================");

		Car car2 = new Car();
		System.out.println("최대 스피트 : " + car2.maxSpeed);
		System.out.println("차 색깔 : " + car2.color);
		car2.run();
		
		System.out.println("=============================");
		// 동일한 class긴 하지만, new 연산자를 이용하면 새로운 인스턴스(객체)를 생성함. 
		if (car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		} else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		}
		
		// car1을 new 연산자 호출. ▶ 메소드(설계도 방)살펴봄, 생성자 확인. ▶ 힙 확인, 만들어냄. ▶ 스텍 car1에 만들어낸 자리값을 줌.
		// car1과 car2는 출력된 이후에 각각 고유의 값을 가질 수 있다. 색이 car1은 검은색이고 car2는 보라색일 수 있음.

	}

}
