package com.yedam.java.example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수> ");
		int count = Integer.parseInt(sc.nextLine());
		Student[] Std = new Student[count];

		for (int i = 0; i < Std.length; i++) {

			//    	▼ 객체는 깨끗하게 비어있는 것으로 준비
			Student student = new Student();

			System.out.println("학생 이름> ");
			String sName = sc.nextLine();
			student.setSName(sName);

			System.out.println("학번> ");
			String sNo = sc.nextLine();
			student.setSNo(sNo);

			System.out.println("국어> ");
			int kor = Integer.parseInt(sc.nextLine());
			student.setKor(kor);

			System.out.println("수학> ");
			int math = Integer.parseInt(sc.nextLine());
			student.setMath(math);

			System.out.println("영어> ");
			int eng = Integer.parseInt(sc.nextLine());
			student.setEng(eng);

			Std[i] = student;

		}

		for (int i = 0; i < Std.length; i++) {
			System.out.println("================================");
			System.out.println("학생 이름 > " + Std[i].getSName());
			System.out.println("학생 번호 > " + Std[i].getSNO());

		}

	}
}
