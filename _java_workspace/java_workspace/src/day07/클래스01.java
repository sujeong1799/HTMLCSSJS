package day07;

public class 클래스01 {
	// 멤버변수 자리 
	
	
	public static void main(String[] args) {
		/* 클래스 - 설계도
		 * 객체를 생성하기위한 설계도
		 * 메서드 - 기능
		 * 
		 * 클래스의 구성정보
		 * - 속성 : 멤버변수 ( 메서드8에서 스캐너 올렸던것처럼)
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 이름, 구동방식(레이저인지 잉크넣는지)
		 * - 기능 : 인쇄, 스캔, 팩스, 복사
		 * 
		 * 멤버변수는 클래스 안, 메서드 위에 작성
		 * 멤버변수는 클래스안에서 사용할 수 있다. (모든 메서드에서 쓸 수 있다는 말)
		 * 
		 * 접근제한자 class 클래스명 {
		 *  // 클래스명은 반드시 대문자로 시작~~!!(규칙)
		 * }
		 * 
		 * - 객체 선언 (객체 생성한거 아님)
		 *  클래스명 객체명;
		 *  
		 * - 객체 선언 & 초기화(생성)
		 *  클래스명 객체명 = new 클래스명 // 선언 초기화(생성)
		 *  
		 * -멤버 메서드 사용하는 법
		 * 객체명.메서드명(); // 멤버변수도 마찬가지
		 * 
		 * 같은 클래스 안에서 메서드를 호출할 때는 메서드명으로 호출가능
		 * - 메서드명();
		 * 
		 * 다른 클래스에서는 메서드를 호출할 때 객체를 이용하여 호출가능 
		 * - 객체명.메서드명();
		 *  
		 * 접근제한자(제어자)
		 * - public : 모두 사용 가능 (제한 없음)
		 * - (default) : 나(내 클래스) + 패키지가 같은 // 안써줌 없으면 그냥 default라고 생각해라
		 * - protected : 나(내 클래스) + 같은 패키지 + 날 상속한 자식 클래스에서만 사용가능.
		 * - private : 나(내 클래스)
		 * 
		 * 클래스에서 public을 붙일 수 있는건 파일명과 클래스명이 같을 때만 가능.
		 * 멤버변수나, 메서드는 pupblic을 붙이는 것에 제한이 없음. 
		 * 클래스만 제한이 있어요.
		 * 
		 * private : 멤버변수/메서드를 다른 클래스에서 사용할 수 없게 함. 
		 * 
		 * - 일반적으로 멤버변수(속성)는 private으로 하고, 메서드(기능)는 public으로 선언함
		 * - 일반적으로 private으로 선언된 멤버변수는 getter(가져오고)/setter(수정)를 통해 변수에 접근할 수 있음.
		 * */
		
		Point p = new Point(); // 클래스명 객체명 print, move 담긴거.
		p.print();
		p.move(5, 3); // 내가 준 숫자 형태로 x,y를 변경하고
		p.print(); // 다시 프린트하세요라는 뜻.
		
//		p.x = 7;  // // x,y를 private로 바꾸면 직접적으로 변경한건 다 에러가 나온다.
					// move를 통해서만 변경 가능하다.
//		p.print(); // x만 바뀐다.
		
		p.move(7, 10); // 변경하는 메서드
		p.print();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
//		p.y = 10;
//		System.out.println(p.x);
//		System.out.println(p.y);
//		
		System.out.println("변경 전 x = "+p.getX());

		p.setX(100); // x를 100으로 바꾼다.
		System.out.println("변경 후 x = "+p.getX());
		
		System.out.println();
		
		System.out.println("변경 전 y = "+p.getY());
		p.setY(40); // y를 40으로 바꾼다.
		System.out.println("변경 후 y = "+p.getY());
		
		System.out.println("x, y");
		p.print();
		
		
		System.out.println("-----------------------------");
		
		Point1 p1 = new Point1();
		p1.print1();
		
		p1.move1(5, 4, 5);
		p1.print1();
		
		System.out.println(p1.getX1());
		System.out.println(p1.getY1());
		System.out.println(p1.getZ1());
		
		System.out.println();
		System.out.println("변경 전 x1 = "+p1.getX1());
		p1.setX1(9);
		System.out.println("변경 후 x1 = "+p1.getX1());
		
		System.out.println();
		System.out.println("변경 전 y1 = "+p1.getY1());
		p1.setY1(10);
		System.out.println("변경 전 y1 = "+p1.getY1());
		
		System.out.println();
		System.out.println("변경 전 z1 = "+p1.getZ1());
		p1.setZ1(200);
		System.out.println("변경 전 z1 = "+p1.getZ1());

		p1.print1();

	}

}


/* 클래스는 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명{
 * 클래스명은 대문자로 시작 (한글도 가능 소문자도 가능하긴함)
 * }
 * */
class Point{ // 접근제한자가 없다는건 default(나 + 같은 패키지)라는거임.
	//멤버변수는 초기화하지 않아도 기본 0 또는 null로 초기화 된다.
	private int x; // public 멤버변수
	private int y;
	
	// x,y 좌표를 프린트하는 메서
	public void print() {
		// (0,0) 이렇게 찍고싶어.
		System.out.println("("+x+","+y+")");	
	}
	
	// x,y 좌표를 변경하는 메서드
	// 매개변수 : x, y의 값을 주고 멤버변수의 x,y를 변경
	public void move(int x, int y1) { // 매개변수 이름 바꿔도 상관없음
		this.x = x; // x가 매개변수 x인지 멤버변수 x인지 모르니까 this를 붙임.
		y = y1;
		
		
	}
	public int getX() { // 멤버변수들이 private라서 직접 접근이 안되니까 새로 메서드 만들어서 하나씩 접근.
		return x;
		
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {// 변경하는거라서 리턴값 x
		this.x = x; //멤버변수 x를 매개변수 x로 바꿔주세요. 색이 다르니까 확인해보세요
	}
	
	public void setY(int y) {
		this.y = y; //멤버변수 y를 매개변수 y로 바꿔주세요
	}
}


class Point1{
	// x,y,z를 멤버변수로 선언
	private int x1; 
	private int y1;
	private int z1;

	// (x,y,z)를 찍는 print 메서드 생성
	public void print1() {
		System.out.println("("+x1+","+y1+","+z1+")");
	}

	// x,y,z의 값을 변경하는 move 메서드 생성
    public void move1(int x, int y, int z) {
    	this.x1 = x;
    	this.y1 = y;
    	this.z1 = z;
    	
    }
    // 각 각의 값을 getter/setter 생성 // getter/setter은 자동으로 만들어줌..헐..
    //오른쪽 마우스 누르고 source > generate getters and setters

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getZ1() {
		return z1;
	}

	public void setZ1(int z1) {
		this.z1 = z1;
	}
    
}
