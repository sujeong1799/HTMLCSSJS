package day04;

public class 배열2 {

	public static void main(String[] args) {
		
		/* 5개 값을 담는 배열을 생상하여 1~5까지의 값을 입력하고 출력
		 * 입력과 출력은 for문을 활용하여..
		 * 출력모양 => 배열이름[번지]=값
		 * arr[0]=1
		 * */
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) { // 0~ 4까지 반복
			arr[i] = i + 1;
			System.out.printf("arr[%d]=%d%n",i, arr[i]);
			
		}
		
		System.out.println();
		
		
		/* 10개 값을 갖는 배열을 생성하고, 짝수만을 저장하고 출력
		 * */
		
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i]= (i+1)*2; // i를 먼저 더해줘야 첫번째가 2부터 나옴
			System.out.printf("arr[%d]=%d%n",i,arr2[i]);
		}
		
		
		System.out.println();
		
		/* 
		 * */
		
		
	}

}
