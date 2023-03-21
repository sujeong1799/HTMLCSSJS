package day06;

import java.util.Scanner;

public class day06과제 {
	

	public static void main(String[] args) {
		/* 계산기 (+ - *  / %) 각 메서드를 만들기
		 * 메서드에서 바로 출력(3 + 2 = 5)
		 * 1. 숫자를 입력받는 메서드 (스캐너)
		 *  - 숫자는 배열로 입력받기 int배열로 for문 돌리거나 각자 넣어서 2개 넣으몀ㄴ 됨
		 * 
		 * 2. 메뉴 메서드 
		 *  - 원하는 계산을 선택해주세요. > 
		 *  - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 
		 * 3. main에서 처리되어야 되는 부분.
		 *  1. 입력받은 숫자(1번메서드) 호출  -> 숫자를 배열로 저장
		 *  2. 2번에서 만든 메뉴 메서드 호출 - > 내가 선택한 번호 가져오기 (리턴받아서 가져와야함)
		 *  3. switch문을 이용해서 2번 메서드 호출 값 담아서 
		 *  4. case에 따라서 계산기 메서드 호출 
		 *  
		 * */
//		메인에서 스위치로 해당하는 케이스가 1이면 덧셈 메소드호출
//		2면 뺄셈~~ 5면 나머지 호출~
		
		int ran[] = input();
		switch(menu()) {
		case 1:
			System.out.println(ran[0]+ran[1]);
			break;
		case 2:		
			System.out.println(ran[0]-ran[1]);
			break;
		case 3:
			System.out.println(ran[0]*ran[1]);
			break;
		case 4:
			System.out.println((double)ran[0]/ran[1]);
			break;
		case 5:
			System.out.println(ran[0]%ran[1]);
			break;
			default:
				System.out.println("입력이 이상해요");
				
			
		}

		
		
	}

	
	
	public static int[] input() {
		int num1, num2;
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값을 입력해주세요");
		num1 = scan.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		num2 = scan.nextInt();
		
		int arr[] = new int[2];
		for(int i=0; i<arr.length; i++) {
			arr[0] = num1;
			arr[1] = num2;
		}
		return arr;
		
	}
	
		
	public static int menu() {
	
	int num1;
	Scanner scan = new Scanner(System.in);

	System.out.println("원하는 계산을 선택해주세요.");
	System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
	num1 = scan.nextInt();
	return num1;

	}

}
