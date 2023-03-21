package day04;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/* ------menu------   
		 * 1.저장|2.출력|3.종료
		 * ----------------
		 * 입력 : 1
		 * 저장되었습니다. // 출력
		 * 
		 * 입력 : 2
		 * 출력되었습니다. // 출력되었습니다.
		 * 
		 * 입력 : 3
		 * 종료되었습니다. // 반복문종료
		 * */
		

		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("------menu------");
			System.out.println("1.저장|2.출력|3.종료");
			System.out.println("----------------");
			System.out.print("입력해줘^^ : ");
			num = scan.nextInt();
			
			// 실제 기능 처리
			switch(num) {
			case 1: 
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("출력되었습니다.");
				break;
			
			case 3: 
				System.out.println("종료되었습니다.");
				break;
			
			default:
				System.out.println("잘못입력했습니다.");
				break;
				
			}
		
		}while(num!=3); // 3이 아니면 계속 반복한다. 무족건 얘는 true니까 잘생각해서 넣으셈
		System.out.println("프로그램 종료");
	}

}
