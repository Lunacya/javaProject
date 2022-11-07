package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// for문도 초기화식이 가능하니 주의를 요함.

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x);
		// x 가 100을 넘어서야 false가 되어 x값이 출력된다.
		// x가 어떤 값일지는 모르겠지만, 최소한 x가 100보단 크다는 사실을 인지해야 한다.

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i;
		}
		System.out.println("1~100까지의 합계 : " + sum);

		// float 타입 카운터 변수
		for (float f = 0.1f; f < 1.0f; f += 0.1f) {
			System.out.println(f);
		}

		// 구구단 2~9단까지 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + " 단 ***");
			// i = 0;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
				// i = 0, j = 0;
				// i = 0, j = 1; ...
			}
		}

		// while문

		// 1 ~ 10까지 출력

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		// count++ 위치를 어디에 두느냐 중요함.
		count = 0;
		while (count <= 9) {
			count++;
			System.out.println(count);

			// 1부터 100까지 출력, 1부터 100까지 합을 출력
			sum = 0;
			count = 1;
			while (count <= 100) {
				System.out.println(count);
				sum += count;

				count++;
			}
			System.out.println("1~" + (count - 1) + "까지 합 : " + sum);
		}

		// 주사위 두개를 굴립니다. 합이 3이 되는 경우까지 계속 굴리는 경우.

		int index = 1;
		// ▼ 실행되지 않음.
		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}
		// ▼ 실행 됨. do가 붙으면서 '반드시' 1번은 실행된다는 점이 while문과 다르다.
		do {
			System.out.println("do ~ while 반복문이" + index + "번 실행됩니다.");
		} while (index != 1);

		// break로 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;
		}

		// 이중 for문에서 break문 사용
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// break가 제어할 수 있는건 안쪽 for문.
				if (lower == 'g') {
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");

		System.out.println("---------------------------------");

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// break가 제어할 수 있는건 안쪽 for문.
				if (lower == 'g') {
					break Outter;
					// 바깥 for문에 Outter 네이밍을 지어주고, break 뒷면에 네이밍을 달면 제어 가능.
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");
		// 이중 for문의 경우 바깥쪽 for문에, 또는 안쪽 for문 어디에 break를 걸어야하는지 확인.
		// 바깥쪽 for문에 break를 걸고 싶다면 Outter 네이밍을 걸어줄 것.

		// continue를 사용한 for문
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)	continue;
			System.out.println(i);
		}

	}

}
