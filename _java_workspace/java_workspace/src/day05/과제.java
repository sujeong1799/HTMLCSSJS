package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
//		배열 안써도 됨
		/* 가위,바위,보 게임
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택을 함
		 * (0 = 가위, 1= 바위, 2 = 보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승 패 무의 결과를 출력
		 * 삼항연산자 (조건식)? true : false;
		 * */
//		int num =3;
//		System.out.println((num % 2 ==0)? "짝수" : "홀수");
		
		int user;
		
		int computer;
		Scanner scan= new Scanner(System.in);
		System.out.println("0(가위) 1(바위) 2(보) 중 하나를 선택하세요.");
		user = scan.nextInt();
		if(user==0) {
			System.out.println("user : 가위");
		}else if(user==1) {
			System.out.println("user : 바위");
		}else {
			System.out.println("user : 보");
		}
		
		computer = (int)(Math.random()*3);
		if(computer==0) {
			System.out.println("컴퓨터 : 가위");
		}else if(computer==1) {
			System.out.println("컴퓨터 : 바위");
		}else {
			System.out.println("컴퓨터 : 보");
		}
		
		if(user==0&&computer==0) {
			System.out.println("무승부");
		}else if(user==0&&computer==1) {
			System.out.println("졌습니다T.T");
		}else if(user==0&&computer==2) {
			System.out.println("이겼습니다~!!");
		}
		if(user==1&&computer==0) {
			System.out.println("무승부");
		}else if(user==1&&computer==1) {
			System.out.println("졌습니다T.T");
		}else if(user==1&&computer==2) {
			System.out.println("이겼습니다~!!");
		}
		if(user==2&&computer==0) {
			System.out.println("무승부");
		}else if(user==2&&computer==1) {
			System.out.println("졌습니다T.T");
		}else if(user==2&&computer==2) {
			System.out.println("이겼습니다~!!");
		}
		
			
		

		
//		System.out.println((num%3==0)? "졌다" : "이겼다.");
		
		
//		 나    컴
//		가위0 + 가위0 = 0 비김
//		가위0 - 바위1 = -1 짐
//		가위0 - 보2  = -2 이김
//		
//		바위1 - 바위1 = 0 비김
//		바위1 - 가위0 = -1 이김
//		바위1 - 보2  = -1짐
//		
//		보2  - 보2 = 0 비김
//		보2  - 가위0 = 2 짐
//		보2  - 바위1 = 1 이김
		

			
		}

	}


