package day06;

import java.util.Scanner;

public class Method03_선생님 {

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
			
		
//		다른 클래스에서 만든 메서드 사용법
//		다른 클래스에서 메서드 가져오고 싶으면 객체 생성해서 가져와
		Method02 m2 = new Method02();
		System.out.println("Method02 class에서 작성된 Method");
		m2.sumPrint(num1, num2);
		
		double[] arr = rem(num1, num2);// 이름은 아무상관읍다.
		
		switch(ch) {
		case "+":
			addition(ch, num1, num2); // void로 한 애들은 출력이 따로 필요없음.
			break;
		case "-":
			//substration(num1, num2);
			System.out.println(num1+ch+num2+"="+substration(num1, num2));
			break;
		case "*":
			mutipulication(num1, ch, num2);
			break;
		case "/":
//			division(num1, num2, ch);
			System.out.println(num1+ch+num2+"="+division(num1, num2, ch));
			break;
		case "%":
			// 리턴을 배열로 리턴 : 몫, 나머지를 담아서 반환하려고 한다. 전체 double로 리턴
			System.out.println("/ 의 결과 : "+arr[0]);// 해당 배열의 0번지
			System.out.println("/ 의 결과 : "+arr[1]);// 해당 배열의 1번지
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println("연산자 종료");

	}
	
	/* 기능 : 두 정수를 입력받아서 더하는 메서드 
	 * 리턴타입 : int 
	 * 매개변수 : int num1, int num2 
	 * 메서드명 : sum
	 * */
	
	public static void addition(String ch, int num1, int num2) {
		System.out.println(num1+ ch + num2+" = "+(num1+num2));
	}
	
	public static int substration(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void mutipulication(int num1, String ch, int num2) {
		// 매개변수의 순서는,,,,,  
		System.out.println(num1+ch+num2+ " = "+(num1*num2));	
	}
	
	public static double division(int num1, int num2, String ch) {
		return (double)num1/num2;
		//여기서 String ch는 넣어도 안넣어도 상관읍어.
	}

	/* 기능 : 두 정수를 입력받아 두 정수를 나눈 몫과 나머지를 double[] 배열로 리턴
	 * 리턴타입 : double[] 배열
	 * 매개변수 : int num1, int num2
	 * 변수명 : rem
	 * */
	public static double[] rem(int num1, int num2) {
		double[] res = new double[2]; // 배열이 없으니까 생성
		res[0] = (double)num1 / num2;
		res[1] = num1 % num2;
		
		return res;

	}
	}


