package day03;

import java.util.Scanner;

public class For문4_Break문 {

	public static void main(String[] args) {
		/* Break문 : 반복문을 빠져나오는 역할을 하는 키워드 
		 * (보통 switch문에서 빠져나오는 역할을 하는데~)
		 * 반복문에서 조건(if문을)문을 동반한다. // 이 조건에 맞다면 돌아가는 루트를 빠져나가겠다~
		 * 
		 **/
		
		// 1~100까지의 합,
		
		int i = 1, sum = 0;
		for(;;) { // for문에서 (;;)으로 생략 가능하다. 
			System.out.print(i+" "); //출력  1... 99 100
			sum = sum+i; // 합계 1 + ... +99 + 100
			if(i==100) { // 합계가 100이 되면 
				break;   // 나간다
			}
			i++; // i=i+1  // 순서가 영향을 끼친다. 합계가 100이 안되면 +1을하고 다시 sum으로 돌아가
		}
		System.out.println();
		System.out.println("1~100까지의 합 : "+sum);
		
		/* 한글자를 입력받아 그대로 입력받은 글자를 출력
		 * y를 입력받으면 종료
		 * a -> a, b->b, c->c, y-> 종료 
		 * */
		
		Scanner scan = new Scanner(System.in);
		//chatAt : 지정한 문자의 위치를 추출 0부터(0 -> 1, 1 -> 2)시작임
		System.out.println("---------------------------");
		for(;;) {  // 반복의 대상이 for문안에 들어가야 한다.
			System.out.println("한글자를 입력해주세요. (y/Y) : 종료");
			char ch = scan.next().charAt(0); // 한글자만 입력받을게여  
			// 얘네를 for문안에 넣으면 계속 반복 가능
			
			System.out.println("입력한 글자 : "+ch);
			 if(ch=='y'|| ch=='Y') {
				System.out.println("종료합니다.");
				break;
			} 			
		}
		
		
		
	}
		
	}



