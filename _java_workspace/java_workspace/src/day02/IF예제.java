package day02;

import java.util.Scanner; // ctrl + shift + O 한개만 있을때 쓰세여 여러개 X

public class IF예제 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}

}
