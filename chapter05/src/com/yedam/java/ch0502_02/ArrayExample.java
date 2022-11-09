package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {

		// 첫번째 : 변수 사용
		int[][] mathScores = new int[2][3]; // int[]의 배열
		// []앞 : 2차원 배열의 크기, []뒤 : 2차원 배열의 값의 크기

		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "]:");
				System.out.println(mathScore[j]);
			}
		}
		System.out.println("========================");
		// 두번재 : 변수 사용 X
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print("\t mathScores[" + i + "][" + j + "]:");
				System.out.println(mathScores[i][j]);
			}
		}
		
		// int 대신 double을 넣어도 작동되긴 함. 실수가 정수보다 범위가 크니 타입 강제변환됨.
		int[][] scoreList = {
								{ 86 ,65 }, // 하나의 배열
								{ 58, 95, 73 } // 하나의 배열
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for(int j=0; j<scoreList[i].length; j++) {
				System.out.print(scoreList[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.println("englishScore["+i+"]["+j+"] : " + englishScore[i][j]);
			}
		}
		
		//
		
		// ▼ String[]은 객체
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[1] == strArray[2]); //false
		System.out.println(strArray[1].equals(strArray[2])); //true 
		// .equals : 내부에 있는 실질적인 값을 비교.
		
		System.out.println("========================");
		
		// *for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		// oldIntAry에 있는 배열을 newIntAry로 넘겨준다.
		// 크기가 큰 newIntAry의 크기를 oldIntAry가 받아주질 못함. 작은 크기에 맞춰주자.
		for(int i=0; i<oldIntAry.length; i++) {
			newIntAry[i] = oldIntAry[i];
		}
		
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		
		System.out.println("========================");
		
		// *System.arraycopy()
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		
		for(int i =0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		// 초기값은 null 맞음. index 2번투버 oldStrAry가 들어감.
		
		System.out.println("========================");
		
		// *향상된 for문 
		int[] scores = { 95, 71, 84, 93, 87 };
		//int index = -1; ▶ index값을 가져오기는 단독으로 못 함. 이렇게 처리 해줘야 함.
		int sum = 0;
		// 기존의 배열에 담긴 값을 임시 변수에 순차적으로 모두 가져온다는 전제 하에 실행함.
		for( int score : scores) {
			sum += score;
			//System.out.println("인덱스 :" + ++index);
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 : " + avg);
		
	}

}
