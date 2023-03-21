package day12;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스란 : 클래스 내부에 선언한 클래스
		 * - 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고,
		 * 	 다른 외부에서 내부클래스를 사용할 일이 없을경우 사용한다.
		 * - 중첩클래스라고도 한다.
		 * - 인스턴스 내부클래스, 정적(static) 내부클래스, 지역(local) 내부클래스, 익명(anonymous) 내부클래스
		 * - 익명(anonymous) 내부클래스 -> 익명클래스를 사용하기 위해 내부클래스를 사용 
		 *  
		 * - 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 private를 선언하는것을 권장.
		 * - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성됨.(static은 다름)
		 * - private이 아닌 내부 클래스는 다른 외부클래스에서 생성할 수 있음.
		 * */
		
		Outclass out = new Outclass(); // Inclass도 같이 생성 완료
		System.out.println("외부 클래스를 이용하여 내부 클래스의 메서드를 호출");
		out.usingclass();
		System.out.println(); //줄바꿈
		
		//외부(Outclass아님)클래스에서 내부클래스를 생성
		//내부클래스가 private면 직접접근X
		Outclass.Inclass inclass = out.new Inclass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inclass.inClassPrint();
		
		System.out.println();
		System.out.println("정적(static) 내부클래스의 static메서드 호출");
		//외부(Outclass아님)클래스에서 객체생성없이 정적(static)내부 클래스 생성
		Outclass.InStaticClass.sTest();
		
		System.out.println();
		System.out.println("정적(static) 내부클래스의 일반메서드 호출");
		Outclass.InStaticClass sInClass = new Outclass.InStaticClass(); // 객체생성 ㅡㅡ;;
		sInClass.inTest();
		
		
	}

}

class Outclass{
	
	//멤버변수
	private int num = 10;
	private static int sNum = 20;
	private Inclass in;

	//생성자
	public Outclass() {
		in = new Inclass(); // 생성만 했지 호출은 X
	}
	
	
	
	// Outclass 멤버변수로 추가하는 것과 같은 효과
	class Inclass{
	//바깥쪽에 클래스가 있는데 안에 하나 더 만드는걸 내부클래스라고 한다.
		
		int inNum = 100;
//		static int sInNum = 200; // 에러! 왜? class Outclass가 생성된 이후에 Inclass를 생성하는건데,  ㅡㅡ?
		
		void inClassPrint() {
			System.out.println("Outclass Num ="+num+" (외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum ="+sNum+" (외부클래스의 static 변수)");
			System.out.println("Inclass inNum ="+inNum+" (내부클래스의 인스턴스 변수)");
		}
		
//		static void sTest() { // 에러!
//			
//		}
		
	} // Inclass 끝
	
	
	//Outclass의 메서드
	public void usingclass() {
		in.inClassPrint(); // 내부클래스 변수를 사용하여 메서드를 호출
	}
	
	
	static class InStaticClass{ // 정적인 클래스 // static 클래스는 객체없이 호출이 가능
		int inNum = 1000;
		static int sInNum = 2000; // 클래스가 static이기때문에 static OK, 메서드에서도 선언가능
		
		void inTest() { // 정적클래스의 일반메서드
//			System.out.println("Outclass Num ="+num+" (외부클래스의 인스턴스 변수)"); // 사용불가 왜? static 클래스에서 인스턴스변수를 어떻게 사용하나요 ㅋ 
			System.out.println("Outclass sNum ="+sNum+" (외부클래스의 static 변수)");
			System.out.println("Outclass sNum ="+sInNum+" (내부클래스의 static 변수)");
			System.out.println("Inclass inNum ="+inNum+" (내부클래스의 인스턴스 변수)"); // InstaticClass의 inNum임.
		}
		
		static void sTest() { //정적클래스의 정적메서드(static 클래스의 static 메서드) 객체없이 호출 가능 
//			System.out.println("Outclass Num ="+num+" (외부클래스의 인스턴스 변수)"); // 사용불가
			System.out.println("Outclass sNum ="+sNum+" (외부클래스의 static 변수)");
			System.out.println("Outclass sNum ="+sInNum+" (내부클래스의 static 변수)");
//			System.out.println("Inclass inNum ="+inNum+" (내부클래스의 인스턴스 변수)"); // 사용불가 인스턴스잖아!!! 캭
		}
		
	}
	
	
} // Outclass 끝 
