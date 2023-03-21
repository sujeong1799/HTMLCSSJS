package day16;

import java.util.ArrayList;

public class LambdaEx {

	public static void main(String[] args) {
		/* Lambda expression : 람다식
		 	함수형 프로그램(Functional Programming : FP)
	 		순수한 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)을
	 		주지 않도록 구현하는 방식. 
	 		순수함수(pure function) : 매개변수만을 사용하여 만드는 함수
	 		즉, 함수 내부에서 함수외부에 있는 변수를 사용하지 않아 함수가 실행되더라도
	 		외부에 영향을 주지 않는 형태
		*/
		
		
		/* (int x, int y) -> {return x+y};
		 * 이게 가능하다고??????
		 * 
		 * int x  (매개변수가 1개일때) -> {return x+y};
		 * 
		 * return이 있으면 중괄호 생략 가능.????
		 * str -> System.out.println(str);
		 * 
		 * */
		
		int result = add(3, 5);
		System.out.println(result);
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(5);
		number.add(30);
		number.add(15);
		
		System.out.println("- 일반 for를 이용한 출력 -");
		for(Integer i : number) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Lambda형태로 출력
		System.out.println("---람다식---"); // 스크립트에서 출력하는 방식, 자바에서는 잘 안쓴다.
		
		
		
		// forEach가 향상된 for문이라고 생각하믄 됨
		number.forEach((n)->{ // n -> 매개변수라고 생각하면 됨 n은 number에서 오는거임. -> 화살표함수?
			System.out.print(n+" ");
		});
		System.out.println();
		
		
		
		
		// 메서드에 직접 참조
		number.forEach(System.out::println);
		System.out.println("--number List 총 개수--");
		System.out.println(number.stream().count());
		
	}
	
	public static int add(int x, int y) {
		return x+y;
	}

}
