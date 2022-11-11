package com.yedam.java.ch0703;

public class StandardWeightInfo extends Human {

	// 생성자
	public StandardWeightInfo(String n, int h, int w) {
		super(n, h, w);
	}

	// 메소드

	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("표준체중 : " + avgwe);
	}

	// ★★★★★ return 해줘야함 아주매우 중요함ㅠㅠ ★★★★★
	public double getStandarWeight() {
		// 표준체중 구하는 기능, 표준체중 변수 = avgwe
		// avgwe 변수는 Human 클래스에 만들어 둠.
		double avgwe = ((height - 100) * 0.9);
		return avgwe;
	}

}
