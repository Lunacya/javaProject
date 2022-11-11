package com.yedam.java.ch0703;

public class Employee {

	// 필드
	// 이름, 연봉
	public String name;
	public int salary;

	// 생성자 : 값을 초기화
	public Employee(String n, int s) {
		name = n;
		salary = s;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	// 메소드
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}
}
