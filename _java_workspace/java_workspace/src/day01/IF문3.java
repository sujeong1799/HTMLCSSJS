package day01;

import java.util.Scanner; // Scanner 클래스 쓰려면 얘 필요함

public class IF문3 {

	public static void main(String[] args) {
		// Scanner 클래스 사용해보기.
		// 값을 입력 받을때 쓴다.
		
		Scanner scan = new Scanner(System.in); // 객체생성
		
		/* 국어, 영어, 수학의 값을 입력받아
		 * 합계, 평균을 구하고, A, B, C, D, F 등급을 구하시오.*/
		
		// 입력유도 안내문자
		System.out.println("점수를 입력해 주세요.(0~100) : 국어, 영어, 수학 순으로");
		
		int kor = scan.nextInt(); // 입력을 하는 값과 담기는 값은 변수 타입이 일치해야한다.
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor < 0 || 100 < kor) { // 국어점수는 0점보다 작고 100점보다 크면 안돼
			System.out.println("국어 점수가 오류.");
		}
		
		if(eng < 0 || 100 < eng) {
			System.out.println("영어 점수 오류.");
		}
		
		if(math < 0 || 100 < math) {
			System.out.println("수학 점수 오류.");
		}
		
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f%n",avg);
		
		char ch = ' '; // 지역변수는 초기값이 없으면 에러가 난다.
		// 지역변수는 무조건 초기화가 되어야 함
		
	
		if(avg < 0 || 100 < avg) {
			System.out.println("평균 계산 오류");
		} else if(avg >= 90){
			ch = 'A';
		} else if(avg >= 80) {
			ch = 'B';
		} else if(avg >= 70) {
			ch = 'C';
		} else if(avg >= 60) {
			ch = 'D';
		} else {
			ch = 'F';
		}
		
		System.out.println("등급 : "+ch);
		
		
		
		scan.close(); // 이 밑으로 스캔 또 못열어 닫는 위치는 중요하지 않음.				

	}

}
