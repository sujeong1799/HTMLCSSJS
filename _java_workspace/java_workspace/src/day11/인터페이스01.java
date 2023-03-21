package day11;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 것.
		 * 
		 * 	인터페이스 : 상수와 추상메서드만으로 구성
		 * 	키워드 : interface ( 쓰면 인터페이스인줄 알음 ) 
		 * 	- 기능요약서 
		 * 	- 자체적으로는 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 *  - 구현 키워드 : implements
		 *  - 인터페이스는 멤버변수가 없음. 항상 이 부분을 염두에 두고 메서드 정리를 해야 한다.
		 *  	
		 * */
		
		Tv t = new Tv();
		t.trunOn();
		t.chUp();
		t.chUp();
		t.ch = 1;
		t.chDown();
		t.chDown();
		t.chDown();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		
		



	}

}

//인터페이스 만들어 보자!
interface Power{
	abstract void trunOn(); // abstract는 안넣어도 상관없음.
	abstract void trunOff();
}

interface Remocon{
	void chUp();
	void chDown();	
}


//구현과 상속은 둘 다 한번에 할 수 있음. 
// Tv클래스를 만들어서 인터페이스 구현
class Tv implements Power, Remocon{ //구현은 다중구현이 가능하다. 구현받는거능 무조건 구현을 해야함
	boolean power;
	int ch;
	
	// 구현 안됐다고 빨간줄 뜨면 밑에 뜨는거 눌러주믄 됨. 
	
	@Override
	public void chUp() {
		// TODO Auto-generated method stub
			if(ch<100) {
			ch++;
			}else {
				ch = 1;
			}
		System.out.println(ch);
	}
	
	@Override
	public void chDown() {
		// TODO Auto-generated method stub)
		if(ch>1) {
			ch--;	
		}else {
			ch=100;
		}
		
		System.out.println(ch);
	}
	
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv가 켜졌습니다.");
		power = true;	
	}
	
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv가 꺼졌습니다.");
		power = false;		
	}
	
	
}
