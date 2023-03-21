package day07;

import java.util.Scanner;

public class day07_야구게임선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Scanner 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 변수들을 선언
		int comNum[] = new int[3]; // 컴퓨터 배열
		int myNum[] = new int[3]; // 내 배열
		int count = 0; // 게임횟수 출력용
		
//		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
//		for(int i=0; i<comNum.length; i++) { // 2. 다시 내 번지로 돌아옴.
//			comNum[i] = (int)(Math.random()*9)+1; // 1~9까지
//			// 따로 메서드를 쓰지 않고 비교해야함
//			// 생성하면서 비교할거야.
//			for(int j=0; j<i; j++){// 이 for문은 내 앞쪽에 같은 값이 있는지 확인.
//				if(comNum[i] == comNum[j]) {
//					i--; // 1. 뒤로 가서 
//					break; // for(j의 구문을 빠져나감)
//				}
//			}
//		} // for문 끝
		
		
		
		
		//lotto 예제에서 만든 메서드 호출
//		Lotto예제 lotto = new Lotto예제();
		Lotto예제.randomArr(comNum); // 처음에 불렀을때 에러가 난 이유 부른 메서드의 값이 45라서 
		// static이 붙어 있으면 객체없이 클래스명으로만 호출 가능하다.
//		Point p = new Point(); // Point 클래스의 객체 생성
//		Point.print(); // static이 아니라서 에러.
		
		
		
		
		
		
		System.out.println("야구게임 시작 └ㅇ┘");
		System.out.println("컴퓨터가 숫자를 정했습니다.");
		
		//4. 사용자 숫자 입력받기
		
		while(true) {  // 
			int s=0;
			int b=0;
			
	
			System.out.println("숫자 입력 (1 ~ 9, 숫자 3개) : ");
			
			// 숫자로 입력받는 경우
//			for(int i=0; i<myNum.length; i++) {
//				myNum[i] = scan.nextInt();
//			}
			
			// 값을 문자로 입력받는 경우
			String mystr =scan.next(); // 
			String[] myNumstrArr = mystr.split(""); // ("") > 한글자씩 잘라서 배열로 저장
			
			// 같은 자리에 있는 값을 넣어줄건데 서로 타입이 달라서 String을 int로 바꿔줘야해
			// Integer.parseInt이용
			for(int i = 0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumstrArr[i]); 
			}
			
			count++; // 카운트 1회 증가
			
			//숫자 비교
			for(int i = 0; i<comNum.length; i++) {//comNum기준으로 탐색
				for(int j = 0; j<myNum.length; j++) { // myNum 기준으로 탐색
					//스트라이크 기준 조건 (값 & 자리수도 같을 경우)
					if(comNum[i]==myNum[j] && i==j) { 
						s++;
					//ball의 조건(값만 같고, 자리수는 다를 경우)
					}else if(comNum[i]==myNum[j] && i!=j) {
						b++;
					}
						
				}
			}
			
			// 출력
			// out 조건
			if(s == 0 && b ==0) {
				System.out.println("아웃");
			}else {
				System.out.println(s+"S "+b+"B");
				System.out.println("시도횟수 : "+count);
			}
			
			if(s==3) {
				System.out.println("정답! 축하합니다!");
				System.out.println("시도횟수 : "+count);

				break;
			
			}
			
		}// while 끝
		
		
		//스트라이크 메서드
		
		//볼 메서드
		
		
		
		
		
	}

}
