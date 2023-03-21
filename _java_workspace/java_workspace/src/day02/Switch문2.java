package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위의 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤수로 결정됨
		 * */
		
		int random= (int)(Math.random()*13)-6;
		System.out.println("주사위 값 : "+ random);
		
		// switch문 이용하여 'num수만큼 전진' 출력
//		switch(random) {
//		case 1:
//			System.out.println(random+"만큼 전진");
//			break;
//		case 2:
//			System.out.println(random+"만큼 전진");
//			break;
//		case 3:
//			System.out.println(random+"만큼 전진");
//			break;
//		case 4:
//			System.out.println(random+"만큼 전진");
//			break;
//		case 5:
//			System.out.println(random+"만큼 전진");
//			break;
//		case 6:
//			System.out.println(random+"만큼 전진");
//
//		}
		
		
		
		if(random>0) {
			System.out.println(random+"만큼 전진");
		} else if(random<0) {
			System.out.println(Math.abs(random)+"만큼 후진하세요");
		} else {
			System.out.println("제자리에 있으세요");
		}
		
		
	}

}
