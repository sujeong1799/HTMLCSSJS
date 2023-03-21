package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - *  / % 를 작성하여 출력
		 * 두 수를 입력받고, 연산자를 입력받아 메서드를활용하여 연산
		 * ex) 3 5 + 받으면 3 + 5 / 3 5 * 받으면 3 * 5
		 * switch써보세요
		 * +면 +라인으로 가서 메서드 호출
		 * -면 -라인으로 가서 메서드 호출
		 * */
		
		int num1, num2;
		String ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("== 계산기 만들기 ==");
		System.out.println("연산자를 입력해주세요 > ");
		ch = scan.next();
		
		System.out.println("첫번째 숫자 >");
		num1 = scan.nextInt();

		System.out.println("두번째 숫자 >");
		num2 = scan.nextInt();
		
		
		switch(ch) {
		case "+":
			int hap = sum(num1, num2);
			System.out.println(hap);
			break;
		case "-":
			int ma1 = ma(num1, num2);
			System.out.println(ma1);
			break;
		case "*":
			int gopa1 = gopa(num1, num2);
			System.out.println(gopa1);
			break;
		case "/":
			double na1 = nanu(num1, num2);
			System.out.println(na1);

			break;
		case "%":
			double nu1 = Namu(num1, num2);
			System.out.println(nu1);

			break;
		default:
			System.out.println("값이 이상해요");

		
		}
		
		

	}
	
	/* 기능 : 두 정수를 입력받아서 더하는 메서드 
	 * 리턴타입 : int 
	 * 매개변수 : int num1, int num2 
	 * 메서드명 : sum
	 * */
	
	public static void addition(String ch, int num1, int num2) {
		System.out.println(num1+ ch + num2+" = "+(num1+num2));
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
		
	

	/* 기능 : 두 정수를 입력받아서 빼는 메서드 
	 * 리턴타입 : int 
	 * 매개변수 : int num1, int num2
	 * 메서드명 : ma
	 * */
	public static int ma(int num1, int num2) {
		return num1 - num2;
	}

	/* 기능 : 두 정수를 입력받아서 곱하는 메서드 
	 * 리턴타입 : int 
	 * 매개변수 : int num1, int num2
	 * 메서드명 : gopa
	 * */
	public static int gopa(int num1, int num2) {
		return num1 * num2;
	}

	/* 기능 : 두 정수를 입력받아서 나누는 메서드 
	 * 리턴타입 : int 
	 * 매개변수 : int num1, int num2
	 * 메서드명 : nanu
	 * */
	public static double nanu(double num1, double num2) {
		return num1 / num2;
	}

	/* 기능 : 두 정수를 입력받아서 나머지 메서드 
	 * 리턴타입 : int
	 * 매개변수 : double num1, double num2
	 * 메서드명 : Namu
	 * */
	public static double Namu(double num1, double num2) {
		return num1 % num2;
	}
}
