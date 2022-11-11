package com.yedam.java.ch0703;

public class EmpDept extends Employee {

	// 필드
	public String deparNm; // 부서이름

	// 생성자
	public EmpDept(String n, int s, String d) {
		super(n, s);
		deparNm = d;
	}

	// getter
	public String getDeparNm() {
		return deparNm;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public int getSalary() {
		return super.getSalary();
	}

	@Override
	public void getInformation() {		
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("부서 : " + deparNm);
	}

	@Override
	public void print() {
		System.out.print("수퍼클래스\n서브클래스");
	}

}
