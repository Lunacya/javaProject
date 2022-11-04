package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		Scanner sc = new Scanner(System.in);
		
		/*int x =sc.nextInt();
		int y =sc.nextInt();
		System.out.println("입력 : " + (x+y));*/
		// 입력 시 중간에 공백(스페이스바)가 있어야 한다.
		
		/*String str = sc.nextLine(); -> nextLine()는 무조건 단독으로 써야 함. enter키값까지 인식해서 출력함.
		String str = sc.next(); //next(), nextInt()는 enter키를 인식하지 않음.
		int var = sc.nextInt();
		System.out.println("입력 : " + str + "," + var);*/
		
		/*System.out.print("첫번째 : ");
		String x = sc.nextLine();
		System.out.print("두번째 : ");
		String y = sc.nextLine();
		int result = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println("결과 : " + result);*/
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
