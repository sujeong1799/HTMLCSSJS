package day05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성 후
		 * 1~50 사이의 랜덤값을 저장 후 출력
		 * */
		
		// 1. 배열을 정의
		int size = 6;
		int[] five = new int[size];
		
		// 2. for 배열의 index 탐색, 랜덤값 배열에 저장, 랜덤값 출력
		for(int i=0; i<five.length; i++) {
			five[i] =  (int)(Math.random()*45)+1;
			System.out.print(five[i]+" ");		
			
		}System.out.println(); // 줄바꿈

		
		// 정렬을 하구싶어.
		
		//오름차순
		for(int i=0; i<five.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<five.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(five[i] > five[j]) { //뒤에있는 j가 작다면 교환 오름차순
					int tmp = five[i];
					five[i] = five[j];
					five[j] = tmp;
				}
			}
		}
		System.out.println("-----오름차순 정렬----- ");
		for(int i=0; i<five.length; i++) {
			System.out.print(five[i]+" ");
		}
		
		System.out.println();
		
		//내림차순
		System.out.println("-----내림차순 정렬-----");
		for(int i=0; i<five.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<five.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(five[i] < five[j]) { //뒤에있는 j가 크다면 교환 내림차순
					int tmp = five[i];
					five[i] = five[j];
					five[j] = tmp;
				}
			}
		}
		for(int i=0; i<five.length; i++) {
			System.out.print(five[i]+" ");
		}

	}

}
