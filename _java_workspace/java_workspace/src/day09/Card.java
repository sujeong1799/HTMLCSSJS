package day09;




public class Card { // 지금 만든건(카드 클래스) 한 장의 카드를 만든거임.
	
	/* - 숫자 1~10, J, Q, K
	 * - 모양 하트, 다이아, 클로버, 스페이드
	 * - 한장의 카드정보를  출력하는 기능
	 * 
	 * - 생성자 : 클래스의 멤버변수들을 초기화 하는 기능 메서드
	 * - 생성자가 하나도 없으면 기본생성자를 자동으로 생성.
	 * - 생성자가 하나라도 있다면 기본생성자는 생성되지 않음.
	 * - 생성자의 이름은 클래스명과 동일, 리턴 자리는 없음
	 * 
	 * - 멤버변수는 private 선언, 메서드는 public 선언
	 * - 멤버변수에 접근하기 위해 getter/setter 메서드 사용
	 * 
	 * */
	
	//멤버변수 설정
	private char shape; // 모양
	private int num; // 숫자 1~10 J(11) Q(12) K(13)
	
	
	
	// 이상한 숫자 들어올때 1♥로 초기화
	public Card() {
		num = 1;
		shape = '♥';
	}
	

	// num와 shape 랜덤돌리고 shape 비교
//	public void Random() { 
//		num = (int)(Math.random()*13)+1;
//
//		int Rshape = (int)(Math.random()*4)+1;
//	
//		switch(Rshape) {
//		case 1:
//			shape = '♥';
//			break;
//		case 2:
//			shape ='♣';
//			break;
//		case 3:
//			shape = '♠';
//			break;
//		case 4:
//			shape = '◆';
//			break;
//		}
//	}
//	


	
	
	// 11~13은 J Q K로 바꿔주고 shape와 출력하는 메서드
	public void Print() {
		System.out.print(shape); // ♥11 > ♥J

		switch(num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
			break;
		}

	}
	
	
	//getter/setter를 생성안하는거는 객체를 생성 안한다는 뜻?
	//getter > 얘 없으면, 죽어. 필수로 만들어야함. 알았지. 만들어. 안만들면 주거.
	//setter > 죽어도 변경 안하면 안만들어도 됨
	

	public char getShape() {
		return shape;
	}

	// 유효하지 않은 shape가 들어오면 하트가 나오게 변경.
	public void setShape(char shape) {
		switch(shape) {
		case '♥': case'♣': case '♠': case '◆':
			this.shape = shape;
			break;
		default: 
			this.shape = '♥';
		}
	}

	public int getNum() {

		return num;
	}

	// 유효하지 않은 num가 들어오면 1로 변경
	public void setNum(int num) {
		if (num < 1 || num > 13) {
			num = 1;
		}
		this.num = num;
	}
	
	



	

}
