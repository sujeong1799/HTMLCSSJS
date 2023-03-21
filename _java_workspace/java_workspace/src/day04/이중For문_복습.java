package day04;

public class 이중For문_복습 {

	public static void main(String[] args) {
		/* 다음을 출력하시오
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */  //공간을 만들고 숫자 넣어보쟝
		
		// cnt++ 찍고 1증가하기, ++cnt 1증가하고 찍기 증가 감소는 순서에 따라 달라진다.
		int cnt = 0;
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				System.out.print((++cnt)+" "); //현재 cnt를 찍고 증가시켜라는 의미
					// cnt++ cnt를 먼저 찍고 더해라
					// 굳이 i나 j를 안넣어도 된다 
			}
			System.out.println();
		}
		
		System.out.println();


		for(int i = 1; i <=9; i++) { // 얘를 가로로 쓸겨
			System.out.print(i+" ");
			if(i%3==0) { // 3의 배수마다 줄바꿈해줘
				System.out.println();
			}
		
		}
		
		System.out.println();

		
		int cnt1=1;
		for(int a=1; a<=2; a++) {
			for(int b=1; b<=5; b++) {
				System.out.print((cnt1++)+" ");
			}System.out.println();
		
		}
			
//		1 2 3 4 5
//		6 7 8 9 10
		
		
	
	}
}


