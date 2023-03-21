package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리수 합계.
		 * ex) 입력 11456 > 출력 65411 > 합계 6 + 5 + 4 + 1 + 1
		 * ex) 입력 19874 > 출력 47891 > 합계 4 + 7 + 8 + 9 + 1
		 * */
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("5자리 숫자를 넣어주세요");
		int num =scan.nextInt();
		int nam = 10; // 몫
		int nu = 1; // 나누는값
		int sum = 0; // 합계
		
		int[] arr = new int[5]; // 저장할 공간
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(num%nam)/nu;
			nam = nam * 10;
			nu = nu * 10;
			sum = sum + arr[i];
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("합계 : "+ sum);
		
		
//		arr[0]=num%10;
//		arr[1]=num%100/10;
//		arr[2]=num%1000/100;
//		arr[3]=num%10000/1000;
//		arr[4]=num%100000/10000;
//		System.out.println(arr[i]);
		
		
		// 숫자 출력
		
//		반복문 이용하여 마지막자리가 없어질 때까지 배열에 저장 / 합계

	}
}