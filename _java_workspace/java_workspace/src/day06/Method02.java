package day06;

public class Method02 {

	public static void main(String[] args) {
		/* Method : 메서드 -> 기능(함수)
		 * - 접근제한자 : 접근할수 있는 주체의 '제한범위'
		 * 	 없는 경우는 디폴트 형태
		 * - 리턴타입 : 메서드를 실행 후 결과로 얻을 수 있는 값 (자료형(타입)으로 표현), ((출력)반환타입)
		 * - 메서드명 : 메서드를 구분하는 이름, 소문자로 시작, 카멜표기법을 사용(여러단어가 붙어있을때 다음 단어의 첫 글자를 대문자로ㅋ)
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 정보값 (받아들이는 값)
		 * - void : 반환할 값이 없을 경우
		 * 
		 *  접근제한자 리턴타입 메서드명(매개변수){
		 *  	기능구현;
		 *  void가 아닐경우 반드시 return이 있어야함.  
		 *  }
		 *  
		 *  메서드의 위치는 클래스안쪽, 다른메서드 밖에 만들어야한다.
		 *  
		 * */
		int hap = sum(1, 2); // sum 호출해서 hap에다 담겠다.
		System.out.println(hap);
		
		sumPrint(63, 51); // 바로 출력나온다 대박
		sumPrint(hap, 2); // hap을 이렇게 쓸 수 있음.
		
		// 둘의 차이점은? return의 값이 있는건 호출하고나서 후작업가능(다른 값에 넣거나 암튼 그런거 ㅋ) 
		// void를 호출하면 출력하고 그냥 끝임
		
		
		int Num = gopagi(6, 3);
		System.out.println(Num);
		
	}
	
	
	
	//메서드 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 *        (매개변수)          (리턴타입)
	 * 리턴타입 : 합 = > int
	 * 매개변수 : 두 정수 = > int num1, int num2
	 * 메서드명 : sum
	 * */
	
	public static int sum(int num1, int num2) {
		return num1 + num2; // 바로 더해서 보내도 됨
	}  // 호출해야지 일하는거임. 호출안한다? 그냥 만들어놓기만 한거임
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void (바로 콘솔에 찍을거니까)
	 * 매개변수 : 두 정수 = > int num1, num2
	 * 메서드명 : sumPrint
	 * */
	
	public static void sumPrint(int num1, int num2) {
		
		System.out.println(num1+num2);
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱 > int
	 * 매개변수 : 두 정수 > int num1, int num2
	 * 메서드명 : gopagi
	 * */
	
	public static int gopagi(int num1, int num2) {
//		int result = num1 *num2; 
//		return result;
		
		return num1*num2;
	}
}
