package com.yedam.java.ch0402;

import java.util.Scanner;

public class ConditinalStatementSubject {

	public static void main(String[] args) {
		// 문제1) 책 161p 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// *****

		// 가장 쉽고 많이 쓰는 방법
		String tree = "";
		for (int i = 1; i <= 5; i++) {
			tree += "*";
			System.out.println(tree);
		}

		// 이중 for문
		for (int i = 1; i <= 5; i++) { // line
			for (int j = 1; j <= i; j++) {// "*" 출력
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제2) for문을 이용해서 1부터 100까지의 정수 중에서
		// 2의 배수가 아닌 숫자의 갯수를 구하세요.
		int count = 0; // 반복되더라도 누적되는 값을 가지고 싶다면, for문 밖에서 선언해줘야 함.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			count++;
//			else {
//				count += 1;
//			}
		}
		System.out.println("2의 배수가 아닌 숫자의 갯수 : " + count);

		// 문제3) 책 161p 4번
		// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해 중 x=5, y=8 / x=10, y=4
		// 첫번째로 구해지는 값을 (x, y) 형태로 출력.
		// 단, x와 y는 10 이하의 자연수

		// 1) 중첩 for문, 2) x, y 는 1부터 10까지 정수
		Outter: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) { // if(4x+5y=60)
					System.out.println(x + "," + y);
					break Outter;
				}
			}
		}

		// 문제4) do~while문과 Math.random() 함수를 이용
		// 1 ~ 10 의 정수 중 7이라는 수가 나올 때 까지 숫자를 출력

		int num = 0;

		do {
			num = (int) (Math.random() * 10) + 1;
			System.out.println("7 숫자 출력 :" + num);
		} while (num != 7);

		// 문제5) 책 161p 3번
		// While문과 Math.random() 함수를 이용
		// 2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력
		// 숫자의 합이 5일 경우에 종료, 아닌 경우에 계속 던진다.
		// 최종으로 주사위를 몇 번 던졌는지 횟수를 출력
		// 숫자의 합이 5가 되는 조합은 (1,4),(4,1),(2,3)(3,2) 이다.

		int total = 0;
		while (true) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			total++;
			System.out.printf("(%d, %d)\n", x, y);
			if (x + y == 5) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총" + total + "번 입니다.");
		
		//문제6) 책 161p 6번
		//    * ▶ 1번째줄, 공백 3개, 별 1개 => 총 문자 4개
		//   ** ▶ 2번재줄, 공백 2개, 별 2개 => 총 문자 4개
		//  *** ▶ 3번재줄, 공백 1개, 별 3개 => 총 문자 4개
		// **** ▶ 4번재줄, 공백 0개, 별 4개 => 총 문자 4개
		
		for(int i=1; i<=4; i++) { // line 표시
			for(int j=1; j<=4; j++) { // 문자 수
				if(j<= (4-i)) { // 각 줄에서 공백을 몇 개 표기하는지가 관건.
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//문제7) 책 161p 7번
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine()); 
			//parseInt는 일종의 String. 타입을 맞춰줌. 캐스팅은 같은 기본 타입끼리/참조 타입끼리만 가능
			if(selectNo == 1) {
				// 메뉴 : 예금
				System.out.print("예금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
			}else if(selectNo ==2) {
				// 메뉴 : 출금
				System.out.print("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			}else if(selectNo ==3) {
				// 메뉴 : 잔고
				System.out.print("잔고> " + balance);
			}else if(selectNo ==4) {
				// 메뉴 : 종료
				run = false;
			}else {
				// 기타입력일 경우 안내 출력
				System.out.println("정해진 메뉴(1~4) 중에서 선택해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
