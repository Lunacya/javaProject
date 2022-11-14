package com.yedam.java.ch011_1;

public class SystemExample {
	public static void main(String[] args) {
		// System.exit()
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.exit(0); // 굳이 강제종료할 필요는 잘 없음, 권장하지 않음.
//			}
//		}
//		System.out.println("프로그램 종료");

		// 현재 시각 읽기

		long time1 = System.nanoTime(); // 15:31:xx:xx:xx

		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += 1;
		}

		long time2 = System.nanoTime(); // 15:32:xx:xx:xx

		System.out.println("sum : " + sum);
		System.out.println("계산 시간 : " + (time2 - time1) + "나노초가 소요됨.");
		
		long time3 = System.currentTimeMillis();
		System.out.println(time3);
		
		}
}
