package day02;

public class test {

	public static void main(String[] args) {
		
		/* 주사위의 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤수로 결정됨
		 * */
		
		int random = (int)(Math.random()*6)+1;
		switch(random) {
		case 1:
			System.out.println(random+"전진하세여");
			break;
		case 2:
			System.out.println(random+"전진하세여");
			break;
		case 3:
			System.out.println(random+"전진하세여");
			break;
		case 4:
			System.out.println(random+"전진하세여");
			break;
		case 5:
			System.out.println(random+"전진하세여");
			break;
		case 6:
			System.out.println(random+"전진하세여");
			break;
		default:
			System.out.println("뭐여");
		}
		
		/* 계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 해당하는 월과 계절을 출력 
		 * 3~5 : 봄, 6~8 : 여름, 9~11 : 가을, 12~2 : 겨울*/
		
		int month = (int)(Math.random()*12)+1;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄 입니다.");
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름 입니다.");
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을 입니다.");
		default:
			System.out.println(month+"월은 겨울 입니다.");
		}
		
		/* 10부터 1까지 출력*/
		
		/* 1부터 10까지 짝수만 2, 4, 6, 8, 10*/
		
		
		/* 1~10까지의 합계 (1+2+3+...+10)*/
		
		/* 2단 출력*/
		
		
		// 2중 for문
		// 2단, 3단, 4단, 5단, ... 9단
		// 2*1, 2*2, 2*3 ...2*9 
		// 2단 1~9, 3단 1~9
		
		
		// 2*1=2 3*1=3 4*1=4 5*1=5 ....
		// 2*2=4 3*2=6 4*2=8 5*2=10 ....
		
		/* 1~10까지의 홀수의 합, 짝수의 합을 출력
		 * */
		
		

	}

}
