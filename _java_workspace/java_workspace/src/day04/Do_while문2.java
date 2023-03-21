package day04;

import java.util.Scanner;

public class Do_while문2 {

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
			num = scan.nextInt();
			
			if(num==1) {
				System.out.println("저장되었습니다.");
			} else if (num==2){
				System.out.println("출력되었습니다.");
			} else {
				System.out.println("종료되었습니다.");
				break;
			}

			
		}while(true); // 3이 아니면 실행문 계속 반복
		

	}

}
