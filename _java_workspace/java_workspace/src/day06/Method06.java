package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 입력 하는 넘버가 7이면 7단~
		 * */
		
		
		/* 기능 : 7을 입력했을시 7*1=7, 7*2=14 ... 나오게하기
		 * 
		 * 리턴타입 : void 바로 출력할거니까.
		 * 매개변수 : 단 > int dan  
		 * 메서드명 : gugu
		 * */
		int dan;
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		dan = scan.nextInt();
		
		gugu(dan);
	}
	
	public static void gugu(int dan){
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
	}

}
