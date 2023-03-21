package day03;

public class 이중For문1 {

	public static void main(String[] args) {
		/* for(1초기값; 2.13.21조건식; 12.20.증감식){  // 1  2  3
		 * 		3.14실행문; * 실행문은 실행하는 순서에 따라 다름ㅋ
		 * 		for(4.15초기화; 5.8.11.16.19조건식; 7.10.18증감식){ // 1~끝까지, 1~끝까지
		 * 			6.9.17실행문;
		 * 		}
		 * }
		 * */
		
		// 1-> 1 -> 1~끝까지? , 1 -> 2-> 1~끝까지 // 이게 뭔말이지 ㅎㅎ 
		
		/* ***** 줄 = i, 별 = j
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		
		for(int i=1; i<=5; i++) {  // 세로 i는 첫번째 줄부터 5번째줄까지 출력
			for(int j=1; j<=5; j++) { // 가로 처음부터 *을 5줄찍것다.
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * */
		
		System.out.println();
		
		for(int i=1; i<=5; i++) { // 그냥 얘는 줄만 나오능거 ㅡㅡㅋ
			for(int j=1; j<=i; j++) { // j는 1부터 i보다 작거나 같게 1늘어간다.
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*     *  i = 1 공 = 4 j = 1
		 *    **  i = 2 공 = 3 j = 2
		 *   ***  i = 3 공 = 2 j = 3
		 *  ****  i = 4 공 = 1 j = 4
		 * *****  i = 5 공 = 0 j = 5
		 * */
		//
		
		int num = 6;
		for(int i=1; i<=num; i++) { // 1부터 5까지 출력
			for(int j=1; j<=(num-i); j++) { // j는 옆으로 5-i만큼 출력 i가 1이면 5-1 =4, 2면 5-2=3
				System.out.print(" "); // 공백 출력
			}
			for(int k=1; k<=i; k++) {  // 별 출력
				System.out.print("*"); // 별 늘어가야해 
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/* if문을 이용한 방법
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) { // j=1, i=1 맞다면 공백을 찍으세요
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {  // 내려갈수록 5-1 >4, 5-2> 3 공백출력
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) { // 2*1-1 = 1, 2*2-1=3, 2*3-1=5
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");// 내려갈수록 + 1
			}
			for(int j=5; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
//		System.out.println();
//		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) { // 5부터 i보다 크거나 같게 1마이너스 // j가 i보다 크면 j--해주면서 내려감
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int i=1; i<=5; i++) { // 1부터 5까지 출력 ㅇㅋ 이해완
//			for(int j=1; j<=(5-i); j++) { // j는 옆으로 5-i만큼 출력 i가 1이면 5-1 =4, 2면 5-2=3
//				System.out.print(" ");
//			}
//			for(int j=1; j<=2*i-1; j++) { // j는 2*i-1만큼 *출력  2*i-1은 홀수만!!! 출력하라는 의미 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			
		
		
		

	}
}


