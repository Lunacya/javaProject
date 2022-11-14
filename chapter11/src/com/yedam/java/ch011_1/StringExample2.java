package com.yedam.java.ch011_1;

import java.util.Scanner;

public class StringExample2 {
	public static void main(String[] args) {
		// 1) 문자열 뒤집기
		// - 입력되는 문자열을 뒤집어서 출력
		// ex) input : abc, output : cba

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char Nm;

		for (int i = input.length() - 1; i>=0 ; i--) {
			Nm = input.charAt(i);
			System.out.print(Nm);
		}

		// 2) 문자열 개수 세기
		// - 아스키 코드 이용
		// - 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
		// ex) input : la2v4b, output : 숫자 3개, 영어 3개
		
		int count1 =   
		
	}
}
