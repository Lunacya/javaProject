package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		// 내부의 gas이므로, this. 안 붙여도 됨.
		if (this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}

		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) { //▼ isLeftGas() 쓴다면 myCar.run(); 만 써도 됨.
			if (this.gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + this.gas + ")");
				this.gas--;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + this.gas + ")");
				return; // 일종의 exit. 어느 위치에 있든 그 순간 끝.
				// System.out.pritnln("종료합니다."); ◀ return 구문 뒤엔 어떤 문장도 실행되지 않음.
			}
		}
	}
}
