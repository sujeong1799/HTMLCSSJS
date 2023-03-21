package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * 수학적 기능을 하기위한 클래스
		 * 반올림, 올림, 버림, max, min, random
		 * */
		
		double num1 = 25;
	
		// 입력하는 변수랑 리턴(반환)변수가 다 정해놓고 늬가 판단해서 잘 써라 
		// 반올림 Math.round 반올림만 정수형으로 (소수점 자리지정 X)
		System.out.println("반올림 : "+Math.round(num1));
		
		// 올림 : Math.ceil, 버림 : Math.floor,
		System.out.println("올림 : "+Math.ceil(num1));
		System.out.println("버림 : "+Math.floor(num1));
		
		// 최대값 : Math.max, 최소값 : Math.min
		System.out.println("최대값 : "+Math.max(3, 5));
		System.out.println("최소값 : "+Math.min(3, 5));
		
		// 절대값 : Math.abs
		System.out.println("절대값 : "+Math.abs(num1)); // 마이너스를 플러스로 바꿔주는 역할.
		
		// 제곱 : Math.pow, 루트 : Math.sqrt, 랜덤값 : Math. random
		System.out.println("제곱 : "+Math.pow(2, 4));
		System.out.println("루트 : "+Math.sqrt(num1));
		System.out.println(Math.random());
		
		// 1~10까지의 랜덤값 추출
		//(int)(Math.random()*n(갯수)+start(뭐부터 시작할거냐 +1하면 1, +2하믄 2겠지)
		//(int)(Math.random()*10)+1 // 1~10까지의 랜덤값 추출
		int random = (int)(Math.random()*10)+1; // 형변환 해줘야함 , 1~10까지의 정수
		System.out.println(random);
		System.out.println((int)(Math.random()*10)); // *10하면 1~9사이의 정수가 나옴 
	}

}
