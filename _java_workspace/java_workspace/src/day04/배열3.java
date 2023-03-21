package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장
		 * 점수의 합계와 평균을 출력하세요
		 * 합계 :
		 * 평균 :
		 *  
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] num = new int[5];
		int sum=0, max = 0, min = 999;
		double avg = 0;
		
		System.out.println("점수를 입력해 주세요. (5명)");

		for(int i = 0; i<num.length; i++) {
			num[i] = scan.nextInt();
			sum = sum + num[i]; // 누적이 되려면 sum + 나 자신 해야함
			// avg 여기에 넣으면 하나하나마다 나누기 때문에 끝나고 나서 구해야함.
//				max = Math.max(max, num[i]);
			// 최소값 구할 때 위에 초기화 값을 바꾸거나 min = num[i]를 써넣어준다.
			if(num[i]>max) max = num[i];
			if(num[i]<min) min = num[i]; // 최소값은 초기값을 0으로 하믄 안됨
						
			}		
			
		
		avg = (double)sum /num.length ;
		System.out.println("합계 :"+ sum);
		System.out.printf("평균 :%.2f%n", avg);
		System.out.println("최고값: "+ max);
		System.out.println("최소값: "+ min);

//		1. scanner 생성
//		2. 배열 선언 int[] arr = new int[5];
//		3. 값 추가 arr[0] = 70;
//		4. For문 for(int i = 1; i<arr.length; i++) {
//						arr[i] = scan.nextInt(); // 여기에 바로 받겠습니다.
//						sum = sum + arr[i];
//					} avg = sum/arr.length
//					
		
		
		
	}

}
