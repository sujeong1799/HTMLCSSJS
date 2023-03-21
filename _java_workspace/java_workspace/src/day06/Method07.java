package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력
		 * ex)3, * > ***
		 * ex)5, O > OOOOO
		 * ex)7, ♥ > ♥♥♥♥♥♥♥ 
		 * */
		
		int num;
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자와 기호를 넣어보세요");
		
		System.out.println("숫자를 입력해주세요.");
		num = scan.nextInt();
		
		System.out.println("기호를 입력해주세요(특수문자O)");
		str = scan.next();
		
		gigi(num, str);
	}

	
	
	/* 기능 : 숫자와 기호를 입력받으면 기호를 숫자만큼 출력
	 * 
	 * 리턴타입 : void 바로 출력할거니까.
	 * 매개변수 : 숫자, 기호  
	 * 메서드명 : gigi
	 * */
	
	public static void gigi(int num, String str) {
		for(int i=1; i<=num; i++) {
			System.out.print(str);
		}
	}
}
