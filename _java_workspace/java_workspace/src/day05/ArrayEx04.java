package day05;

public class ArrayEx04 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 자료형(변수타입) 배열명[][] = new 자료형(변수타입)[길이][길이];
		 * 
		 * */
		int arr[][] = new int [5][3];
		int cnt =1;
		// [5] 행 개수 5개
		for(int i=0; i<arr.length; i++) { // 0~4 5개행 
			// [3] 열 개수 3개
			for(int j=0; j<arr[0].length; j++) { //0번지 행에 있는 열의 개수.
				arr[i][j] = cnt;  // 이게..뭐야...이게..뭐야...
				cnt++;
				System.out.printf("%3d",arr[i][j]); //하나의 arr배열을 3칸을 차지해서 출력해라.
				}
			System.out.println(); // 줄바꿈
		}
		
		
	}

}
