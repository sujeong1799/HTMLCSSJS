package day04;

public class While문 {

	public static void main(String[] args) {
		/* 
		 * 	초기화
		 * while(조건식){
		 * 	실행문; // 조건식이 false가 될 수 있는 구문을 포함해야 함. 안하믄 무한반복
		 *  증감식;
		 * }
		 * */
		
		
		// 1~10까지 출력해보세요
		System.out.println("* For문 활용 *");

		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("* while문 활용 *");
		
		
		int i=1; // 초기화
		while(i<=10) { // 조건식
			System.out.print(i+" "); // 실행문
			i++; // 증감식
		}
		
		System.out.println();
		System.out.println();
		System.out.println("while문을 활용하여 짝수만 출력");
		
		int j = 1;
		while(j<=10) {
				if(j%2==0) {   // { 을 넣으면 출력이 안됨.
				System.out.print(j+" ");
				
			}j++; //
		}
		
		System.out.println();
		System.out.println();
		
		int a = 0;
		while(a<=10) {
			a++; // continue를 타면 하단은 무조건 실행X 그래서 a++을 위로 올려줌 // 아래로 내리고 싶으믄 
			if(a%2!=0) {
		 		continue;
		}System.out.print(a+" ");
				
		}
		
		
		// 증감식을 아래로 내리는 경우.
		int b = 1;
		while(b<=10) {
			if(b%2!=0) {
		 		continue;
		}System.out.print(b+" ");
		 b++; // 아래로 내리고 싶으믄 
				
		}
		
}
}
	





