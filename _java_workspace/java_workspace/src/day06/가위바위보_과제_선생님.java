package day06;

import java.util.Scanner;

public class 가위바위보_과제_선생님 {

	public static void main(String[] args) {
//		배열 안써도 됨
		/* 가위,바위,보 게임
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택을 함
		 * (0 = 가위, 1= 바위, 2 = 보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승 패 무의 결과를 출력
		 * 삼항연산자 (조건식)? true : false;
		 * */
		
		System.out.println("가위, 바위, 보 게임시작");
		Scanner scan = new Scanner(System.in);
		
		int comNum = (int)(Math.random()*3); // 0, 1, 2 중 랜덤
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요");
		
		String myChoice = scan.next(); // 가위, 바위, 보 중에 받을거다.
		
		//컴터는 int고 받는값은 String임 둘 중 하나의 자료형을 바꿔야한다.
		
		//컴퓨터의 선택을 String으로 변환
		String comChoice = (comNum == 0) ? "가위" : (comNum == 1) ? "바위" : "보";
		// 컴 num이 0과 같으면 "가위", comNum이 1과 같으면 "바위" 아니면 "보"
		System.out.println("com 선택 > "+comChoice);
		
		//비교
		
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다." : "졌습니다.");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "이겼습니다." : "졌습니다.");
			} else {
				System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
			}
				
		}
		
		System.out.println("게임종료");
		
		scan.close();
		
		

	}

}
