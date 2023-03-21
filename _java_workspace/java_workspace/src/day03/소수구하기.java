package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13 나 자신빼고 떨어지지않음 --ㅋ
		 * 소수는 약수가 2개인수 (1과 나자신)
		 * */
		// 누적 합계 = sum = sum+i
		// 개수 : count = count + 1
		
		// num을 입력받아서 입력받은 num가 소수인지 아닌지 출력
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = scan.nextInt();
		int count = 0; 
		
		
		// num이 7이면 소수는 1, 7 2개 
		
		for(int i=1; i<=num ; i++) {  // i<=num의 범위만큼 i를 돌려 num/1, num/2 ~ num/7까지  
			if(num%i==0) {   // num을 i로 나눈값이 0이면~ (나눈 값이 0인걸 골라내는 작업)
				count = count + 1; // (약수의 개수를 1개 더해서 숫자세라) (count++) 1회 카운트 
				// 나눈값이 0이 아니면 다시 올라가서 num/2, num/3 계속해줘
			}
			}
		if(count == 2) { // 총 카운트 값이 2이(1과 자기자신)면 소수여 
			System.out.println(num+"는 소수입니다.");
		} else {
			System.out.println(num+"는 소수가 아닙니다."); // 그 외에는 아님 
		}
		
		
		// 약수 구하는 로직 
		for(int i=1; i<=num; i++) {
			if(num % i == 0){
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		System.out.println("--------------------------------");
		
		/* 1~100까지의 소수를 출력
		 * */
		
		//2~100까지의 소수 출력하기.
		
		int cnt = 0;
		for(int num1 = 2; num1 <= 100; num1++) { // 소수인지 확인할 수 있능..
			cnt =0; // 초기화 안하믄 cnt는 1이 되니께 안됨 
			for(int i = 1; i<=num1; i++) {
				if(num1%i==0) {
					cnt = cnt + 1;
					
				}
			
			}
//			System.out.println(num1+"  >>> "+cnt); // 모르겠으면 찍어봐 
			if(cnt == 2) {
				System.out.print(num1+" "); //
			}
		}
		
		}
		
	}


