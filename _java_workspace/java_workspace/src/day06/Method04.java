package day06;

import java.util.Random;

public class Method04 {

	public static void main(String[] args) {
		/* 전부 다 메서드로 . . . .. 처리
		 * 
		 * 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 ㅠ.ㅠ (정수 배열을 리턴)
		 * 2. 5개 담은 배열을 전달 받아서 평균을 연산하는 메서드 (double 평균을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * 
		 * main에서는 연산식이 있으면 안된다.
		 * main에는 메서드간의 데이터 전달 및 호출만 있어야 한다. 
		 * */
		
		int a[] = random();
		double avg = avg(a);
		last(a, avg);
		
		
	}
	
	/* 기능 : 랜덤(1~100) 정수 5개를 배열에 담는 메서드 
	 * 리턴타입 : 정수배열 = > int[]
	 * 매개변수 :  
	 * 메서드명 : random
	 * */
	
	public static int[] random() {
		
		int[] a = new int[5];
		for(int i=0; i<a.length; i++) { 
		a[i] = (int)(Math.random()*100)+1;
		}
		return a;
	}
		
	
	
	/* 기능 : 5개 담은 배열을 전달 받아서 평균을 연산하는 메서드 (double 평균을 리턴)
	 * 리턴타입 : 평균 = > double
	 * 매개변수 : 배열 = > int arr[] 
	 * 메서드명 : avg
	 * */
	
	public static double avg(int a[]) {
	int sum = 0;
	for(int i=0; i<a.length; i++) {
		
		sum = sum + a[i]; 
	}
	return sum / (double)5;
	
		

	}
	/* 기능 : 정수 5개와 평균을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : int a[], double avg
	 * 메서드명 : last
	 * */
	
	public static void last(int a[], double avg) {
		
		for(int tmp : a) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("평균 : "+avg);
		
		}			
		
		
	
	

}


