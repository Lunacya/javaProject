package com.yedam.java.ch0703;

public class Company {
	public static void main(String[] args) {
		
	EmpDept emp = new EmpDept("이지나", 3000, "교육부");
	
	// 이름, 연봉, 부서
	emp.getInformation();
	//자식 클래스 메소드 사용	
	emp.print();
	}
}
