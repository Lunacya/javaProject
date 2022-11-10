package com.yedam.java.ch0605;

public class Member {

	// 필드
	private String id;
	private String tel;
	private int age;

	// 생성자

	// 메소드

	// private String id;
	public String getId() {
		// 원본 데이터( luna )
		// luna님 입니다.
		id += "님 입니다.";
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int age() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("0보다 작은 나이가 저장되었습니다." + " 다시 한 번 확인해주세요.");
			return;
		} else {
			this.age = age;
		}
	}
}
