package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 클래스 테스트
		User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;
		/* ▼ Java script
		let user = {
				name : '홍길동',
				age : 25,
				height : 175.7
		};
		 */
		
		// 배열을 선언 ▶ 모든 타입을 값으로 가질 수 있음.
		int[] intAry = null;
		// System.out.println("intAry[0] : " + intAry[0]);

		//값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { // i<=3 했을 시 ArrayIndexOutOfBoundsException 오류 : 배열이 가질 수 있는 인덱스를 벗어났다.
			sum += scores[i];
		}
		// ▲ for문이 아니면 밑처럼 해야 됨.
		//sum += scores[0];
		//sum += scores[1];
		//sum += scores[2];

		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		//주의사항
		int[] scoreList = null;
		scoreList = new int[] {83, 90, 87};
		// 변수를 먼저 선언하고 나서, 후에 수를 주는 건 불가능하다.
		// 쓰고 싶으면 >new 연산자< 해줘야 함. 생성자를 호출해줌. 크기 주면 안 된다 [] 비워둬야 함.
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum + scoreList[i];
		}
		
		System.out.println("총합 : " + sum);
		
		// new 연산자로 배열 생성
		int[] array = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("array["+i+"] : " +array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i = 0; i<strAry.length; i++) {
			strAry[i] = String.valueOf(i);
		}
		
		for(int i = 0; i<strAry.length; i++) {
			System.out.println("strAry["+i+"]" + strAry[i]);
		}
		
//		------------------------------
//		static int add(int[] numList) {
//			int sum = 0;
//			for(int i=0; i<numList.length; i++) {
//				sum += numList[i];
//			}
//			return sum;
//			
//			sum = add(new int[] {83, 90, 87});
//		----------------------------------------
		
		
		}
	}