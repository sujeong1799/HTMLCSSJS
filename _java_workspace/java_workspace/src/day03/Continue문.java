package day03;

public class Continue문 {

	public static void main(String[] args) {
		// continue : pass 조건이 맞다면 패스!
		
		/* 1~10까지 출력하려고하는데 5만 빼고 출력
		 * 1, 2, 3, 4, 6, 7, 8, 9, 10
		 * */
		
		for(int i=1; i<=10; i++) {
			if(i==5){
				continue;
			}
			System.out.print(i+" "); // 5가 빠지고 출력 
		
		}
		
		System.out.println();
		
		
		
		// 짝수만 찍을거야 홀수는 패스
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				// 여기 안에서 출력하면 홀수 나옴.
				continue;
				}

			System.out.print(i+" ");

		}
		System.out.println();
		

		
		
}
}

