package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		/* 자동 타입 변환 */
		byte byteValue = 10;
		//char charValue = byteValue; 
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가'; // 가 = 유니코드 44032
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		// ↑ 변환해도 값의 손실이 일어나지 않는다.
		
		// 강제 타입 변환
		intValue = 44032;
		charValue = (char) intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		// 정수 타입 연산
		byte result = 10+20;
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; // 첫번재 방법(보통 방법)
		byte result3 = (byte)(x + y); // 2번째 방법(잘 안 씀)
		System.out.println(result2 + "," + result3);
		
		char charValue1 = 'A'; // A=65
		char charValue2 = 1;
		int intResult = charValue1+charValue2;
		System.out.println("유니코드 : " + intResult);
		System.out.println("출력문자 : " + (char)intResult);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long longResult = value1 + value2 + value3;
			
		int intv1 = 10;
		double doublev1 = 5.5;
		double plusv1 = intv1 + doublev1;
		
		int intVar1 = 10; 
		//int resultVar1 = intVar1/4; -> int 타입을 사용한 이상, intVar1/4를 실행되면 2만 나온다. int 대신 double 붙여도 그러하다.
		double resultVar1 = intVar1/4.0; // 10.0 / 4.0 -> 2.5가 나온다.
		System.out.println("10/4 결과 : " + resultVar1);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1/ y1;
		System.out.println("1/2 결과 : " + result1);
		
		// 문자열 결함
		int value = 10 + 2 + 8; //20
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";  // 10+2 = 12, "12"+"8" = 최종 "128"
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8; // "10"+"2" = "102", "102"+"8" = 최종 "1028"
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8; // "10"+"2" = "102", "102"+"8" = 최종 "1028"
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8); //우선순위를 무시고 먼저 실행하고 싶다면, ()로 표시해주면 된다.
		System.out.println(str4);
		
		// 기본 타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		//공백은 값이 없기에 표시되는 것은 없다. 대신 변수 타입을 바꿔준다.
		String strV4 = "" + 105.23;
		System.out.println(strV4);
				
	}

}
