package day04;

import java.util.Scanner;

public class Do_while문 {

	public static void main(String[] args) {
		/* for, while문은 false면 조건식이 한번도 실행 안될수도 있다.
		 * do{
		 * 실행문;
		 * } while(조건식); // 조건식 필수.
		 * */
		
		/* 값을 입력하면 그대로 출력하는 구문
		 * 단. y/Y가 입력되면 종료
		 * */
		
		
		// 1~10까지 출력하는 방법
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		} while(i<=10);
		
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("한글자를 입력해주세요. (y/Y 입력시 종료)");

		char ch;


		do {
			System.out.println("한글자를 입력해주세요. (y/Y 입력시 종료)");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
			} while(!(ch=='y' || ch=='Y')); // y가 아니면 실행문 계속 반복
										 // ||로 하면 둘 중에 하나는 false니까 계쏙 실행문 돌아감
		System.out.println("종료합니다.");
		
		//break를 썼을때 
		char ch1;
		do {
			System.out.println("한글자를 입력해주세요. (y/Y 입력시 종료)");
			ch1 = scan.next().charAt(0);
			System.out.println(ch1);
			if(ch=='y'||ch=='Y') { // y/Y면 
				break; //나간다.
			}
			} while(true); // 참이면 계속 실행ㅋ
										 
		System.out.println("종료합니다.");
		
		
	}

}
