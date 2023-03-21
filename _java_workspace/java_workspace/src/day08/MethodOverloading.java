package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/* 메서드 오버로딩 (Method overloading)
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(타입, 개수, 순서)가 다르면 가능.
		 * 리턴타입은 상관없다. 매개변수 이름도 상관없음. 
		 * */
		
		System.out.println(sum(1, 2));
		System.out.println(sum(1.2, 3.4));
		String a;
		
		// 케이스에 없는걸 그대로 쓰면 자동형변환해서 계산됨.
		
		
		/* 가변길이 메서드
		 * 1+2 1+2+3 ... 
		 * 피연산자의 값이 일정하지 않을 경우 매개변수의 개수와 상관없이 매개값을 줄 때 사용
		 * */
		
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(3,4,6,3,3,6,3,6,2,6,7,8,3,5,4));
		int arr[] = {78,45,87,35,5,98,12,65,77};
		System.out.println("arr 배열의 합: "+ sum(arr));
	}
	
	/* 더하기 하는 메서드 생성
	 * int num1, int num2를 매개변수로 받아 연산한 결과를 리턴
	 * */
	
	
	public static int sum(int num1, int num2) {
		return num1 + num2; 
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3; 
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	//가변길이 메서드
	public static int sum(int ...num) {
		int sum = 0;
		//가변길이 num은 배열처럼 사용
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
}
