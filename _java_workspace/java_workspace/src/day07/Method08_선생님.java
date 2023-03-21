package day07;

public class Method08_선생님 {

	public static void main(String[] args) {
		/* 배열이 주어졌을때 배열을 출력하는 메서드 생성
		 * 
		 * */
		
		int[] arr = new int[] {5,7,8,9,4,0,1,11,13,16,12,2,10,3,14};

		System.out.println("-----정렬전-----");
		printArray(arr);
		
		System.out.println();
		
		System.out.println("-----정렬후-----");
		sortArray(arr);
		printArray(arr); // 프린트하는 메서드
		
		// 정렬은 정렬만하게 왜? 재사용성 높이려구.
		// 정렬 후 출력으로 만들면 재사용을 못하니께
		
	}
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 정수 배열 -> int[] arr
	 * 리턴타입 : void
	 * 메서드명 : printArray()
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i!=0) { // i를 5로 나눴을때 0이믄서 0이 아닐때..?
				System.out.println();
			}
			System.out.printf("%3d",arr[i]);
		}
		
	}
	
	
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 정수배열 => int[] arr
	 * 리턴타입 : void (단순히 정렬만 하는거라서) 
	 * 메서드명 : sortArray()
	 * 오름차순
	 * */
	
	public static void sortArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<arr.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(arr[i] > arr[j]) { // 뒤에값이 작을때 바꾸주는거 오름차순 뒤에 값이 클 때 바꿔주는거 내림차순 
					int tmp = arr[i]; // tmp랑 바꿔
					arr[i] = arr[j]; 
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	
		/* 새로운 배열을 만들고 랜덤수를 채워 리턴하는메서드
		 * 랜덤수 범위 (1~100까지)
		 * 매개변수 : int size
		 * 메서드명 : randomArray
		 * 리턴타입 : 배열 > int[]
		 * */
		
		public static int[] randomArray1(int size) {
			int arr[] = new int[size];
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*100)+1;
			}
			
			return arr;		
			
		}
	
}
