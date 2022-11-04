package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// 부호 연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		// byte, short, char 타입인 경우
		byte b = 100;
		//byte result3 = (byte)-b; 굳이 쓸려면 캐스팅() 강제 타입변환 해줘야 함.
		int result3 = -b; //캐스팅 하지 않는 경우는 int 변환
		System.out.println("result3 : " + result3);
		
		// 증감연산자
		int x =10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++;	// 11
		++x;	// 12
		System.out.println(" x = " + x);
		
		System.out.println("-------------------");
		y--;	// 9
		--y;	// 8
		System.out.println(" y = " + y);
		
		System.out.println("-------------------");
		z = x++; 
		// 0. 본래 대입 연산자는 후반에 시작되나, 피연산자++ 이므로 대입 연산자 먼저 계산
		// 1. z 에 x값이 먼저 대입 된다. z = 12
		// 2. 이후, x++가 계산된다. x = 13
		System.out.println(" z = " + z); //12
		System.out.println(" x = " + x); //13
		
		System.out.println("-------------------");		
		z = ++x;
		// 1. ++피연산자 이므로 먼저 계산, x = 14
		// 대입 연산자. z에 x 대입시킴. z = 14
		System.out.println(" z = " + z); //14
		System.out.println(" x = " + x); //14
		
		System.out.println("-------------------");
		z = ++x + y++;
		// 1) ++x
		// 3) y++ => 8+1 = 9
		//	  [왼쪽 -> 오른쪽으로 순위가 흘러갈 때 제일 뒤에 있음. +와 동급이기에 순위 +보다 뒤로 밀림]
		// 2) x + y => 15 + 8 = 23
		// 4) = 대입 연산자 => z = (x + y) => z = 23
		System.out.println(" z = " + z); // 23
		System.out.println(" x = " + x); // 15
		System.out.println(" y = " + y); //9
		
		/***/
		x = 5;
		y = 5;
		
		System.out.println("-------------------");
		z = x++ + --y;
		// 1) --y => y=4 
		// 2) x++ => x=6
		// 3) x + y => 5 + 4 = 9
		// 3) = 대입 연산자 z = x+y = 5+4 = 9
		System.out.println(" z = " + z); //9
		System.out.println(" x = " + x); //6
		System.out.println(" y = " + y); //4
		
		System.out.println("-------------------");
		z = --x + y++;
		// 1) --x : 5
		// 2) x + y : 5 + 4 =9
		// 3) y++ : 5 [+와 동급. + 뒤에 있으니 + 뒤에 계산.]
		// 4) = 대입 연산자 : 5 + 4 = 9 
		System.out.println(" z = " + z); //9
		System.out.println(" x = " + x); //5
		System.out.println(" y = " + y); //5
		
		
		System.out.println("-------------------");
		// 논리 부정 연산자 : 조건문 쓸 때 자주 쓴다.
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		// 예시
		boolean isOpen = true;
		//true값만 도출하는 if문에서 강제로 참값으로 만들어버림.
		if(!isOpen) {
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업 중입니다.");
		}
		
		// 산술 연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result :" + result); // 7
		
		result = v1 - v2;
		System.out.println("result :" + result); // 3
		
		result = v1 * v2;
		System.out.println("result :" + result); // 10
		
		result = v1 / v2;
		System.out.println("result :" + result); // 2
		
		result = v1 % v2;
		System.out.println("result :" + result); // 1
		
		// 비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 <= num2 );
		System.out.println(">= :" + bResult); //true
		bResult = ( num1 == num2 );
		System.out.println("== :" + bResult); //true
		bResult = ( num1 != num2 );
		System.out.println("!= :" + bResult); //false
		
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		System.out.println("문자 비교 : " + (char1 > char2)); //false
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4)); //true
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6)); //false
		System.out.println("float VS float : " + (v5 == (float)v6)); //true
		
		// 논리 연산자
		int charCode = 'A';
		
		// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		// 먼저 실행하고 싶은게 있으면 () 처리하기
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		
		// 유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		// & : 앞에게 false면 뒤에 값을 확인한다. 즉 2개를 반드시 연산한다
		// && : 앞에게 false면 바로 false를 내버림. 즉 앞에 것만 연산해본다.
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자");
		}
		
		// 유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		// | = or
		// | : 앞에게 True면 뒤에 값을 확인한다. 즉 2개를 반드시 연산한다
		// || : 앞에게 True면 바로 True를 내버림.
		if((numValue % 2 == 0) | (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((numValue % 2 == 0) || (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		// 복합 대입 연산자
		int resultA = 0;
		resultA += 10; // resultA = resultA + 10
		System.out.println("+= : " + resultA);
		resultA -= 5; // resultA = resultA - 5
		System.out.println("-= : " + resultA);
		resultA *= 3; // resultA = resultA * 3
		System.out.println("*= : " + resultA);
		resultA /= 5; // resultA = resultA / 5
		System.out.println("/= : " + resultA);
		resultA %= 3; // resultA = resultA % 3
		System.out.println("%= : " + resultA);
		
		// 삼항 연산자 : 값을 반환하는 조건문.
		// %c = char타입에 대응해주는 애. 문자로 출력해준다네~
		int score = 85;
		char grade = (score > 90) ?'A' : 'B';
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n", score, grade);
		
		int age = 17;
		String message = (age >= 20) ? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이며 %s입니다.\n", age, message);

		
	}

}
