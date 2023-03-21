package day06;

public class Method04_선생님 {

	public static void main(String[] args) {
		/* 전부 다 메서드로 . . . .. 처리
		 * 
		 * 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 ㅠ.ㅠ (정수 배열을 리턴)
		 * 2. 5개 담은 배열을 전달 받아서 평균을 연산하는 메서드 (double 평균을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * 
		 * main에서는 연산식이 있으면 안된다.
		 * main에는 메서드간의 데이터 전달 및 호출만 있어야 한다. 
		 * */
		
		//테스트로 찍어봄
//		int arr[] = random();
//		for(int tmp : arr) {
//			System.out.println(tmp);
//		}
//		
//		double avg = avg(arr);
//		System.out.println(avg);
//			
			
		
		int ran[] = random();
		double avg = avg(ran);
		print(ran, avg);
		
		System.out.println("-----------");
		print(random(),avg(random()));
		// 다른 랜덤값 나옴
		
		System.out.println("-----------");
		print(ran,avg(ran));
		//맨 위의 같과 같음.
			
		}
	
	
	
	/* 랜덤(1~00) 정수 5개를 배열에 담는 메서드
	 * 리턴타입 : 정수배열 = > int[]
	 * 매개변수 : X (랜덤이 알아서 숫자 만들어 주니까 매개변수 안씀)
	 * 메서드명 : random
	 * */
		public static int[] random() {
			int arr[] = new int[5];
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*100)+1;
			}
			return arr;
		}
		
		/* 배열을 전달받아서 평균을 연산하는 메서드
		 * 리턴타입 : 평균 = > double
		 * 매개변수 : 배열 = > int arr[] 
		 * 메서드명 : avg
		 * */
		
		public static double avg(int arr[]) { // int arr[]이 있다고 가정하고 작성해
			int sum = 0;
			for(int i=0; i<arr.length; i++) { // 합계 계산
				sum=sum+arr[i];  
			}
//			double avg = (double)sum / arr.length;
			return (double)sum / arr.length;
		}
		
		// 이렇게 써도된다.
		public static double avg1() {
			int arr[] = random(); // 위에서 만든 random 호출
			int sum = 0;
			for(int i=0; i<arr.length; i++) { // 합계 계산
				sum=sum+arr[i];  
			}
			return (double)sum / arr.length;
		}
		
		
		
		
		/* 정수 5개와 평균을 출력하는 메서드
		 * 리턴타입 : 출력은 리턴이 없음 - > void
		 * 매개변수 : 배열, 평균 = > int arr[], double avg
		 * 메서드명 : print 
		 * */
		
		public static void print (int arr[], double avg) {
			System.out.println("5개의 랜덤 정수 값");
			for(int tmp : arr) {
				System.out.print(tmp+" ");
			}
			System.out.println();
			System.out.println("평균 : "+avg);
		}
		

	}


