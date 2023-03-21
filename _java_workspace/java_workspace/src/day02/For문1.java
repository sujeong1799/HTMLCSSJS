package day02;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while
		 * 
		 * while, do~while : 같아보이지만 다름; 오히려 for, while이 같은 일을 한다.
		 *  
		 * for(1.초기화; 2.5.8.11 조건식; 4.7.10증감연산식){ // 숫자 - 돌아가는 순서ㅋ 마지막은 항상 조건식으로 끝남.
		 * 		3.6.9.실행문;
		 * }
		 * 
		 * 1. 초기화 : 조건식이나, 실행문에서 사용하는 변수를 초기화 (처음 한번만 실행, 생략가능)
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 s.t.o.p 생략가능하지만~ 생략하면 무조건 참임
		 * 3. 증감연산식 : 조건식에서 사용되는 변수를 증가/감소 시켜서 반복 횟수를 결정 (생략가능)
		 * */
		
		 /*1~10까지 출력하는 예제
		 초기화 : 1부터 (i=1;), 반복을 2번 해야하믄? i,j써
		 조건식 : 10까지  (i<=10;), ●언제 종료할지를 정함●
		 증감연산식 : i의 값을 1씩 증가해라 (i = i+1) or (i++)
		 실행문 : i를 출력
		 반복 종료후 실행문 : 지금은 없는 경우임.
		 */ 
		
		/* 같은 i인디 왜 에러가 안나냐? 지역변수의 특징때문임.
		 * 지역변수의 범위 {선언   소멸} */
		
		for(int i=1; i<=10; i++) { // i변수는 for문 안에서 선언하고 소멸시켜 ㅋ
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i+=2) { // a값을 계속 더하고 싶을때 (i=i+a) -> i+=a a=숫자 넣어
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		/* 10부터 1까지 출력
		 * 초기값 : 10부터
		 * 조건식 : 1까지
		 * 증감연산식 : i--
		 * */
		
		for(int i=10; i>=1; i--) { 
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		/* 1부터 10까지 짝수만 2, 4, 6, 8, 10
		 * 초기값 : 2부터
		 * 조건식 : 10까지
		 * 증감연산식 : i+=2
		 * */
		
		
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("홀수 pass~ ");
			}
		}
		
		System.out.println();
		
		/* 1~10까지의 합계 (1+2+3+...+10)
		 * 초기값 : 1부터
		 * 조건식 : 10까지 i<=10 
		 * 증감연삭시 : i++
		 * 실행문 : 누적 (sum) 변수 선언
		 * 실행 후 (sum)출력할거야.*/
		
		int sum = 0; // 변수 선언 초기화
		for(int i=1; i<=10; i++) {
			sum = sum + i; // 더하기만 (sum+=i)// 안에다 int sum 하믄 한번만 되고 사라짐 밖에다 써줘라
		}
		System.out.println(sum);
	}
}
		
		
		