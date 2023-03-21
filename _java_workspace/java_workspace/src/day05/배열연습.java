package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수를 ㄹ입력받아 배열에 저장하고
		 * 점수의 합계, 평균, 최대, 최소값을 출력
		 * */
		// 1. 스캐너 열기
		Scanner scan = new Scanner(System.in); 
		
		// 2. 배열선언, 변수들 선언
		int size = 5;
		int[] num = new int[size];  // 배열선언
		int sum =0, max = 0, min = 0; // 변수선언
		float avg = 0;
		
		// 3. for문을 사용하여 배열안을 탐색 index 번지에 값을 저장
		System.out.println("점수를 입력하세요(5명의 점수)");

		for(int i=0; i<num.length; i++) { 
			num[i] = scan.nextInt();
			sum = sum + num[i]; // 합계 구하기.
			
//			max = Math.max(max, num[i]); 이런 방법을 쓸수도있다.
		}
		
		// 4. 합계, 평균, 최대, 최소값 구하기.			
		max = num[0];
		min = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
			max = num[i];
			}else if(num[i]<min) {
			min = num[i];
			}
		}

		// 5. 출력
		avg = sum / (float)num.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		
		
		
	}

}
