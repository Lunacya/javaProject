package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = {10, 53, 26, 85, 75};
		int sum = 0; 
		// 배열은 인덱스를 기반으로 한다. 시작값은 0부터 시작.
		for(int i=0; i<array.length; i++) {
			sum += array[i]; // sum에 array의 값을 계속 누적.
		}
		System.out.println("총합 : " + sum);
		
		double avg = sum/ (double)array.length;
		System.out.printf("평균 : %.2f\n" , avg);
		
		// 문제2) 배열의 최대값과 최소값을 구하세요.
		// 임의로 값을 넣지 말 것.
		int max = array[array.length-1]; //array[0];
		int min = array[0];
		
		for(int i=0; i<array.length; i++) {
			//최대값
			if(max < array[i]) {
				max = array[i];
			}
			//최소값
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		// 문제3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			//최대값
			if(max == array[i]) {
				maxIndex = i;
			}
			//최소값
			if(min == array[i]) {
				minIndex = i;
			}
		}
		
		System.out.println("최대값 : " + max + "는" + (maxIndex+1)+"번째입니다.");
		System.out.println("최소값 : " + min + "는" + (minIndex+1)+"번째입니다.");
	}

}
