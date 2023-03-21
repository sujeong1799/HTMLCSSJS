package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 최대공약수
		 * 공약수 : 두 수의 공통된 약수
		 * 최대 공약수 : 두 수의 공통된 약수중 가장 큰 값
		 * 최대공약수 구하기전에 공약수를 먼저 구해 ㅋ
		 * 8  : 1 2 4 8
		 * 12 : 1 2 3 4 6 12
		 * 공약수: 1 2 4
		 * 최대 공약수 : 4
		 * */
		
		
		
		
		int num1=8, num2=12;
		int g = 0; // 최대공약수를 담을 변수
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) { //공통적으로 나누어 떨어지는지 체크 
			System.out.print(i+" ");
				g = i;
			}
		}
		System.out.print("두 수의 최대공약수 : "+g);
		
		
		/* 반복횟수 : num1부터 1씩 감소
		 *  조건이 맞다면 break;
		 * */
		System.out.println();
		

		for(int i=num2; i>=1; i--) { // 하나씩 마이너스 할거니께 i>=1, i--로 바꿔줘야함
			if(num1%i==0 && num2%i==0) {
				System.out.print("최대공약수 : "+i );
				break; // 처음 만나는 공약수가 최대 공약수라서 바로 빠져나옴	
			}
		}
		
		
		
		
	}
}

