package com.yedam.java.ch0701;

public class Application {

	public static void main(String[] args) {

		Child child = new Child();

		// 자식 클래스 고유 필드
		child.lastName = "latte";
		child.age = 20;

		// 부모 클래스 필드
		System.out.println(child.firstName + child.lastName);
		
		//System.out.println(child.job); ▶ private 설정된 값은 자식이 가져올 수 없다.

		
		// 부모 ▶ 여러명의 자식 가질 수 O
		// 자식 ▶ 여러명의 부모 가질 수 X
		
		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
		
		// 부모 클래스 필드 사용
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		// 자식 클래스 필드 사용
		System.out.println("채널 : " + dmb.channel);
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요.");
		dmb.receiveVoice("안녕하십니까, 전 고길동 입니다.");
		dmb.powerOff();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		Member member = new Member("고길동", "123123-456456", 1);
		
		// 부모 객체의 필드 사용
		System.out.println("name : " + member.name);
		System.out.println("ssn : " + member.ssn);
		
		// 자식 객체의 필드 사용
		System.out.println("memberNo : " + member.stdNo);
		
		System.out.println("===========================");
		
		Child cd = new Child();
		
		cd.method1();
		cd.method2();
		cd.method3();
		
		System.out.println("===========================");

		Compute com = new Compute();

		double result = com.areaCircle(10);
		System.out.println("result : " + result);
		
		System.out.println("===========================");

		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
		System.out.println("===========================");

		Child chd = new Child();
		Parent parent = chd;
		// 부모 클래스에 있는 필드, 메소드를 사용을 하되 
		// 만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재한다면
		// 부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용 
		// ▶ 자동 타입 변환. 자식 클래스에서 오버라이딩한 내용을 끌어와 써서 출력한다.
		//Parent parent = new Child();
		
		parent.method1(); // 내용은 자식 클래스에서 오버라이딩된 내용이 출력.
		parent.method2();
		//parent.method3();
		//▲부모 타입으로 변환되었기에, 일단 자식 클래스에 있는 method3이 불려지지 않는다.
		
		

	}
}
