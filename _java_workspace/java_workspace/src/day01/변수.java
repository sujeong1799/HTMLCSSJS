package day01; // 어느 폴더안에 들어있는 파일인가 (위치알려주내)

public class 변수 { // 변수 클래스 범위

	public static void main(String[] args) { // 메인메서드 메서드가 있어야 동작이 가능하다. 메서드는 반드시 클래스 안에 있어야 한다.
		// 변수명, 클래스명 한글사용 가능
		System.out.println("method 내부");
		System.out.println(1234); // 클래스에 쓰면 에러뜸
		
		// 변수 : 리터럴값을 담는 메모리 공간
		// 주석 - 한줄주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해 사용
		/* 여러줄 주석입니다
		 * 싱기해 
		 * 우앙왕아와우와*/
		
		// 변수 선언 방법 - > 변수타입 변수명;
		int num, num2, num3, num4;    // 변수선언만(같은 자료형일 경우 여러 변수를 동시에 선언)
		num = 123;  // 값 지정
		
		int num5 = 1234; // 선언 후 값 지정
		byte num6;
		char ch;
		float fl1;
		boolean bool;
		// 노란밑줄 - 왜 했니? 경고 사용하지않은 변수,객체,import한테만 줄쳐짐 ㅡㅡ;
		// 빨간밑줄 - 에러요
		
		int appleCount; // 변수명은 의미 있게 지정
		int applecount; // 대소문자 구분함. 다른 변수
		
		// int num; // 중복선언 불가능
	
		System.out.println("num1의 값 = "+num);
		
		//a라는 int 변수를 선언 후 값을 지정하고, a 변수의 값을 출력하시오
		
		int a = 400;
				
		System.out.println("a변수의 값은 "+a+"입니다.");
		
		// num1과 a변수의 값을 하나의 구문으로 출력해라
		System.out.println("num1의 값 = "+num+", a변수의 값 = "+a);
		System.out.println("num+a의 값 = "+(num+a));
		
		// 문자 char는 한글자만 입력가능
		char ch2 = '\''; // 문자열 한 글자 이상의 문자는 "", 문자 한 글자는 '', 의미가 있는 특수문자나 '를 입력하고 싶다면 \를 붙이고 뒤에 값을 쓰면 됨.
//		char ch3 = 'abc'; // 에러남
		System.out.println("ch = "+ch2);
		
		// 문자열 String (String 클래스를 이용해서 문자열 처리함)
		// 일반 class는 객체를 만들어서 객체로 사용해야하지만 String은 자주 사용해서 자료형처럼 사용 가능함.
		String str = "abc"; 
		System.out.println("str = "+str);
		
		int b = 10; // 일반적으로 10진수의 수 10을 저장
		int c = 010; // 8진수의 수 10을 저장 0~7까지만 사용 8 = 10
		int d = 0x10; // 16진수 수 10을 저장 0~ABCDEF 사용 16 = 10
		
		System.out.println("10진수의 10 ="+b);
		System.out.println("8진수의 10 ="+c);
		System.out.println("16진수의 10 ="+d);
		
//		int e = 123456789012; // int 범위를 넘음 에러
		long e = 123456789012L; // long형은 접미사 L을 필수로 써야 한다. 대소문자 구분 없음
		
		// 기본형 실수형은 double로 인식
		// float형의 실수값은 접미사 f를 반드시 써야함.
		float f = 1.123f;
		
		bool = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor1 = kor;
		// = 의 의미는 오른쪽의 값(값을 가지고 있는 값, 변수)을 왼쪽(반드시 변수)에 담아라
		
		int g = 10, h = 20, y = 50;
		int k, z = 10;
		
		// 이름 변경할때 바꾸고싶은 쪽에 오른쪽 클랙 > refactor > Rename
				
	}
	
}
