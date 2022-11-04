package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -50;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 100.5; => 정수만 가능, 실수는 byte 타입으로 할 수 없다는 오류 뜸
		//byte var6 = 128; => int 인데, byte로는 표현 불가능이라고 오류 뜸
		System.out.println(var1);
		//>>Java가 정수값은 기본적으로 int라고 인식함.<< 
		//>>그래서 int의 허용값을 넘어서면 반드시 숫자 허용값 뒤에 L을 붙여줘야 한다.<<
		//(소문자 l도 되긴 하지만 숫자1과 혼동되니 그냥 대문자를 붙이자.)
		long var5 = 100000000000L;
		long var6 = 1000000; //int 허용범위 안의 값엔 L 안 붙여줘도 된다!
		
		// char 타입
		
		char v1 = 65; // char는 ''를 써야한다. 큰따옴표 안 됨 구분함.
		char v2 = '가'; //문장은 못 담음. 한 글자만 담을 수 있음.
		int v3 = v1; //또다른 정수 타입의 글자를 옮길 수 있다.
		int v4 = v2;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		// String 타입을 사용하여 문장에 담음.
		String name = "홍길동"; //큰따옴표 사용. 문자열 리터럴. 유니코드로 전환 안 됨. 객체이다.
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3)); //index, 0부터 시작한다.
		
		//char VS String
		//char v4 = "A"; 큰따옴표 인지하지 못함. String으로 인지해버림.
		//char v4 = 'AB'; 두글자 이상은 유니코드에 없는 값. 인지하지 못한다. ' '(공백) 도 마찬가지.
		//String v5 = ''; 작은따옴표 인지하지 못함.
		String v6 = " "; //공백이 있거나 특수문자가 있어도 상관없다.
		
		String str1 = "누군가 \"안녕\"하면서 인사했다."; // p.66
		
		//float
		float num1 = 3.14F; //float 타입을 쓸 경우, 값 뒤에 F를 붙여야 인지할 수 있다.
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
		boolean stop = ( 1>2 );
		if(stop) {
			System.out.println("중지합니다."); 
			}else {
				System.out.println("시작합니다.");}
		}
	}

