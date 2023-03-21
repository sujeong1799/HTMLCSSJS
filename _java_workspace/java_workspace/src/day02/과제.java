package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 1~100까지 2의 배수를 (짝수) 출력
		 * 2 4 6 8 10하면 줄바꾸기
		 * 12 14 16 18 20 하면 줄박구기
		 * 
		 * */
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) { // 2의 배수
				System.out.print(i+" "); // 2의 배수 출력완
				if(i%10==0) { // 특정한 조건이 되면~ // 조건이 안되면 패스하고 계속 2의 배수 출력함
					System.out.println(); // 줄바꾸기 해줘
				}
			
			}
		}

	}
}

