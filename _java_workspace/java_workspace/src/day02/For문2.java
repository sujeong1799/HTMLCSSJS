package day02;

public class For문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4 .... 2*9=18
		 * */
				
		
		int num =2;
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(2*i));
		}
		
		System.out.println();
	
		
		// 2중 for문
		// 2단, 3단, 4단, 5단, ... 9단
		// 2*1, 2*2, 2*3 ...2*9 
		// 2단 1~9, 3단 1~9
		
		for(int i=2; i<=9; i++) { 
			System.out.println();
			for(int j=1; j<=9; j++) {
				
				System.out.println(i+"*"+i+"="+i*j);
			}
					}
		
		System.out.println();
		
		// 2*1=2 3*1=3 4*1=4 5*1=5 ....
		// 2*2=4 3*2=6 4*2=8 5*2=10 ....
		
		
		for(int i=1; i<=9; i++) { // i는 고정 
			System.out.println(); //줄바꿈

			for(int j=2; j<=9; j++) { // 앞에 같이 하나 바뀔때 얘는 길이만큼 겁나 돌아
			// i = 1 일때 j는 2~9인데~
				System.out.printf(j+"*"+i+"="+j*i+"\t");
			//	2*1 3*1 4*1~~~ 순으로 돌아가는 거임 
			}

					}

		
		System.out.println();
		
		/* 1~10까지의 홀수의 합, 짝수의 합을 출력
		 * */
		
		int sum = 0, sum1 = 0; //  sum + i = 1~10까지 더한거자너 
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) { // 짝수의 조건
				sum = sum + i; // 짝수의 합계
			}else { // 홀수의 조건    // 나능 바본가 왜 else if를 썼지? 
				sum1 = sum1 + i; // 홀수의 합계
			}
		}
		
		System.out.println("짝수합계 : "+sum);
		System.out.println("홀수합계 : "+sum1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		}
	}
	
