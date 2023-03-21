package day05;

public class Method01 {

	public static void main(String[] args) {
		//메인클래스는 출력을 위한 클래스
		/* 메서드 : 기능또는 함수라고 한다.
		 * 접근제한자 : 접근할 수 있는 주체의 제한범위
		 * static, private, default, public
		 * void 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * main 메서드명 : 메서드 이름(소문자로 시작)
		 * (변수타입[] 이름) 매개변수 : 메서드를 실행하기 위해서 필요로하는 값
		 * 
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명 (매개변수){
		 * 기능구현;
		 * }
		 * 
		 * 메서드를 선언하는 위치
		 * 클래스 안, 다른 메서드 밖
		 * */
		
		int num1 =10;
		int num2 =20;
		
		int hap = sum(100, 200); // sum 메서드를 호출해서 계산하구 온거임.
		System.out.println(hap);
	}
	
	//메서드 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드를 구현하려고 함.
	 * 리턴타입 : 합을 알려줌 (int)
	 * 메서드명 : sum
	 * 매개변수 : 두 정수(int sum1, int num2)
	 *  
	 * */
	
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // sum의 값이 int자료형으로 바뀌고 sum을 호출하는 애한테 줄거야.
		
	}
	
	
}
