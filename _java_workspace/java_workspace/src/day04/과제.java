package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤 수 하나를 생성해
		 * 그걸 맞추는 게임 ㅡㅠ 엉엉
		 * 예) 컴퓨터가 랜덤수를 생성했습니다. (1~50사이)  // 답 25
		 * 사용자 입력 : 20
		 * up해주세유
		 * 사용자 입력 : 30
		 * down해주세요
		 * 사용자 입력 : 25
		 * 정답입니다!!~!~!!~!~
		 * 
		 * */
		
		
		int num;
		int i = (int)(Math.random()*50)+1;
		
		System.out.println("컴퓨터가 랜덤수를 생성했습니다! (1~50)");
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("사용자 입력 : ");
			num = scan.nextInt();
		
			if(num>50){
				System.out.println("50안에 숫자를 쓰시라구요");
			}else if(num>i) {
				System.out.println("Down해주세요!!");
			} else if(num<i) {
				System.out.println("UP해주세요!");
			} else {
				System.out.println("정답입니다!");
				
			}
			
		} while(num!=i);
		
		
		
	}

}
