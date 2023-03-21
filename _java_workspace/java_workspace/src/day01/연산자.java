package day01;

public class 연산자 {

	public static void main(String[] args) {
		/* 대입연사자 : = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장 
		 * a = b  
		 * b의 값을 a에 저장(대입)해라./ 덮어쓰기 기존에 있던 a의 값은 사라짐
		 * a는 반드시 변수여야 한다.
		 *  */
		
		int a = 10;
		int b = 20;
		a = 30; // 기존의 a의 값은 사라짐
		b = b + 10; // 두개를 연산해서 b에 저장(대입)
		
		System.out.println("a : "+a+", b : "+b);
		
		// b + 30 = a; 에러발생 반대로 하면 됨.
		
		// 산술 연산자 : + - * / %(나머지연산자)
		System.out.println(4+4);
		System.out.println(4-4);
		System.out.println(4*4);
		
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		
		/* 나누기
		 * 정수 / 정수 = 정수 (소수점을 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 실수 = 실수
		 * 실수 / 정수 = 실수 */
		
		System.out.println(3/2);
		System.out.println(3/2.0);
		System.out.println(3.0/2.0);
		System.out.println(3.0/2);
		
		// 자료형 정수 -> 실수로 변환하는 경우를 형변환이라고 한다.
		
		int num1 = 3;
		int num2 = 2;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/(double)num2); // 한 곳만 형변환 하세요
		
		// 나머지연산자 %
		System.out.println(4%3);
		System.out.println(44%7);
		
		// 문제 국어 70점, 영어 35점, 수학 97점일 때 국어, 영어, 수학 세과목의 합과 평균을 구하여 콘솔에 표시
		
		int kor, eng, math;
		kor = 70;
		eng = 90;
		math = 97;
		
		int sum = kor + eng + math;
		double avg = sum /3.0; // 나누는 값이 0이면 에러가 뜸.
		
		System.out.println("국어, 영어, 수학 점수의 합 = "+sum);
		System.out.println("국어, 영어, 수학 평균 = "+avg);
		
		// 비교 연산자(결과가 true/false로 출력)와 논리 연산자는 if문에서 체크
		System.out.println(4 > 5);
		
		// 삼항연산자 (조건식) ? A : B  해당하는 조건식이 맞다면 A, 아니면 B
		System.out.println((avg >= 80) ? "합격" : "탈락"); // avg가 80이상이면 합격 아니면 탈락
		
		
	}

}
