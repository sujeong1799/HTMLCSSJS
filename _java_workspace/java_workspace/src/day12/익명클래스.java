package day12;

public class 익명클래스 {
	public static void main(String[] args) {
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
		 * 
		 * 익명클래스를 사용하는 이유
		 * - 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우
		 * - 메서드의 매개변수로 사용해야 하는경우
		 * */
		
		
//		TV t = new TV();
//		t.trunOn();
//		t.trunOff(); // 직접 접근
		
//		product(t);
		
		
		//익명클래스로 작업한 경우 (딱 한번만 쓸거야)
		
		//interface는 존재해야한다. 
		product(new Power() {

			@Override
			public void trunOn() {
				System.out.println("전원을 켜요");
			}

			@Override
			public void trunOff() {
				System.out.println("전원을 꺼요");
				
			}// tv객체가 없을경우
			
		});
		
	}
	
	
	public static void product(Power p) { // <얘는 interface Power를 구현한것
		p.trunOn();
		System.out.println("Tv가 작동중입니다.");
		
		p.trunOff();
		
	}
	
}

interface Power{
	void trunOn();
	void trunOff();
	
}
//
//class TV implements Power{
//
//	@Override
//	public void trunOn() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 켜집니다.");
//	}
//
//	@Override
//	public void trunOff() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 꺼집니다.");
//	}
//	
//}