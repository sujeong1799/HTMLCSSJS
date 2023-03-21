package day02;

public class Switch문1 {

	public static void main(String[] args) {
		// switch : 값을 케이스마다 분리해서 실행시켜주는 조건문 
		// 중간에 반드시 break가 있어야함 없으면 다 실행함
		// if는 참/거짓일때 쓰기 좋아요
		/*
		 * switch(변수/식){ 
		 * 	case 값1: 
		 * 		실행문; 
		 * 		break; // 멈춰! break없으면 다음꺼도 실행됨
		 * 	case 값2:
		 * 		실행문;
		 * 		break;
		 * 	default;   // 나머지라서 값이 없음
		 * 		실행문;
		 * 		break; // 없어도 상관 없음. 얘가 마지막이기 때문에 ㅋ
		 * }
		 * 
		 * */
		
		int num = 5;
		
		switch(num) {
		case 1:
			System.out.println("num :"+num);
			break;
		case 2:
			System.out.println("num :"+num);
			break;
		case 3:
			System.out.println("num :"+num);
			break;
		default:
			System.out.println("num는 1,2,3이 아닙니다.");
		}
	}

}
