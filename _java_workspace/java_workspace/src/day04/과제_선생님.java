package day04;

import java.util.Scanner;

public class 과제_선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스캐너열기
		Scanner scan = new Scanner(System.in);
		
		// 랜덤수 결정
		int random = (int)(Math.random()*50)+1;
		int num = 0, count = 0, count2=5;
		System.out.println("컴퓨터가 랜덤수를 결정했습니다 (1~50까지)");
		System.out.println(random);
		// 반복문 열기
		while (num != random) {
			System.out.println("입력: ");
			num = scan.nextInt();
			count++; // 몇번만에 성공했는지 확인하고 싶을때! 사용자가 입력했을때 1회 증가.
						
			if (count>count2) {
				System.out.println("실패하셨습니다. 정답은 : "+random);
				break;
			} 
			
			
			//비교
			if(num<0 || num >50) {
				System.out.println("범위를 벗어났습니다.");
			}else if(num>random) {
				System.out.println("Down하세요");
			}else if(num<random) {
				System.out.println("Up하세요");
			}else {
				System.out.println("정답입니다");		
				System.out.println(count+"번만에 맞췄습니다."); 
				}
			}
			
		
		
		
		
			}
			
			
			
	}
		

			



