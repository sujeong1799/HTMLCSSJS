package day03;

import java.util.Scanner;

public class For문3 {

	public static void main(String[] args) {
		/* 1부터 100까지 합계
		 * */
		int sum = 0;

		for(int i=1; i<=100; i++) { // i를 위에 선언하고 i=1;을 생략할수있지만 자리는 있어야함.
			sum = sum + i; // 누적 > 내변수 = 내변수 변수 + sum대상 > (sum+=i)
		//   0  =  0  + 1;
		//   1  =  1  + 2;
		//   3  =  3  + 3; ... +100
		//   i = i + 1 // i++을 밑에 써도 되긴 함 

		}
//		System.out.println(i); // 마지막 i의 값을 출력해보면 101이 나온다. 
		System.out.print("1부터 100까지의 합계 : "+sum);
		
		System.out.println();
		
		/* 약수구하기 
		 * 약수 : 나누어서 떨어지는 수들의 모임.
		 * 12의 약수 : 1, 2, 3, 4, 6, 12 
		 * 뭘 반복하는 수로 잡아야하징? 
		 * 1~12까지 다 나눠보장 나머지가 0이 되는 수를 출력.
		 * num = 12;
		 * 1부터 12까지의 수를 num와 나누어서 떨어지는(나머지가 0이되는) 수를 출력해라.
		 * 초기값 : 1부터
		 * 조건식 : 12까지
		 * 증감식 : 1씩증가
		 * 실행문 : 나머지가 0이되는 수를 출력
		 * */
		
		
		
		System.out.print("숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		System.out.print(num+"의 약수 :");
		for(int i = 1; i<=num; i++) {
			if(num%i==0) { // 12를 i로 나눠 ^^..
				System.out.print(+i+" ");
				
				}
			} 
		
		
		
		
			
		
		
		
	}

}
