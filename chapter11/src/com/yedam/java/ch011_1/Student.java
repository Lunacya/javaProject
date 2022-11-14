package com.yedam.java.ch011_1;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	// 여기서 코드를 작성
	@Override
	public boolean equals(Object obj) {
		Student student (Student) obj;
		
		if(studentNum.equals(student.studentNum)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
