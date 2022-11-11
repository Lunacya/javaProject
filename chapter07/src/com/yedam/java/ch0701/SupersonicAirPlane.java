package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane {

	// ▷자식 클래스◁
	public static final int NORMAL = 1; // 일반비행모드
	public static final int SUPERSONIC = 2; // 초음속비행모드

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다.");
		} else {
			super.fly(); // 부모 클래스(AirPlane)의 메소드▶fly(); 호출.
			// 문제가 발생할 시, 부모 클래스만 수정하면 바로 적용되는 장점이 있다.
		}
	}
	
	//public void test() {
	//	super.fly();
	//} ▲ 오버라이딩 뿐만 아니라 이런 방식도 가능 함.
}
