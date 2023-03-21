package day08;

public class 클래스03 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * */
		
		Card c1 = new Card();

		c1.Print();
		
		c1.setNum(12);
		c1.Print();
		
		c1.setShape('◆');
		c1.Print();
		
		c1.setShape('♠');
		c1.setNum(4);
		c1.Print();
		
		// 카드에 있지 않는 모양/숫자가 들어오면 무조건 1♥를 찍고싶어.
		c1.setShape('▲');
		c1.setNum(16);
		c1.Print();
	}
	

}

class Card{

	/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
	 * 모양 : 하트(♥), 클로버(♣) 스페이드(♠) 다이아(◆)
	 * 숫자 : 1~10, J Q K (이거 외 다른거 나오믄 안됨)
	 * 
	 * 클래스의 구성
	 *  - 멤버변수 : char shape, int num, 1~13까지하고 숫자 11 12 13을 J Q K 로 나오게한다.
	 *  - 메서드 : print(카드모양, 내용찍기) 하트1인지 클로버4인지
	 *  - getter/setter 
	 *  - 생성자 : 하트 1이 초기값 (푸린트하면 ♥1 < 이렇게)
	 * */
	
//	카드를 만드는 클래스 하나
//	만약에 4가지 모양이 아닌 다른게 들어오면 숫자가 기본 셋팅♥
//	숫자가 13이상 들어오면 그냥 1 나오게 
	
	
	private char shape; // 모양
	private int num; // 숫자
	
	
	
	
	
	// 생성자 선언 방법
	// public 클래스명()//매개변수는 필요하면 생성 없을수도 잇음.{초기값;}
	public Card() { // 그냥 만들면 이게 나옴. 상수아닌이상 초기값 이렇게 설정 안해줌;;
		shape = '♥'; // this를 붙이는 경우는 매개변수랑 멤버변수 이름이 동일일때
		num = 1;
	}
	
	// 메서드
	// shape, num를 출력하는 메서드.
	public void Print() {
		
		switch(num) {
		case 11 :
			System.out.print("J");
			break;
		case 12 : 
			System.out.print("Q");
			break;
		case 13 :
			System.out.print("K");
			break;
		default:
			System.out.print(num);
		}
		System.out.println(shape);
		
	}


	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		
		switch(shape) {
		case '♥': case'♣': case '♠': case '◆':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
		}
	}


	public int getNum(int num) {
	
		return num;
	}


	public void setNum(int num) {
		this.num = num;
		if(num < 1 || num > 13) {
			this.num = 1;
		}
	}
	
	
	
	
}
	
	
	
	
	
	
