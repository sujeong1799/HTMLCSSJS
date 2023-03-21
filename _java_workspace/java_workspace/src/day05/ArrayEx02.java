package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr를 생성 후 출력
		 *
		 **/
		
		int size = 10;
		
		int[] arr = new int[size];
				
		for(int i=0; i<arr.length; i++) {
			arr[i]= i+1;
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(); // 줄바꿈
		
//		// 배열을 섞는 코드 random을 활용하여 섞기.
//		// 임시변수를 만들어서 거기에 값을 옮겨놓고 다른 값 넣은 다음에 빈값에 값을 넣는다.
//		
//		int a = 10;
//		int b = 20;
//		int c = a; // a값을 c에다가 넣어
//		
//		a = b; // b를 a에다가 담을거야
//		b = c; // c를 b에다가 담을겨
//		
//		System.out.println("a:"+a+", b:"+b);
		
		
		// 방법 : 랜덤한 번지 (0~arr.length)를 선택해서 (앞에 있는) 다른 번지와 교환
		//(int)(Math.random()*개수)+시작값;
		int min = 0; // 시작값
		int max = arr.length; // 개수
		
		
		// 배열 섞기
		for(int i=0; i<arr.length; i++) { // 0부터 시작
			int random =(int)(Math.random()*max)+min; // 랜덤번지 골라주세요
			int tmp = arr[i]; //arr[0]번지 값이 tmp로 이동
			arr[i] = arr[random]; // 다른 값이 arr[0]번지 값으로 이동
			arr[random] = tmp; // tmp 값이 arr[random]번지로 이동
			
		}
		System.out.println("---- 섞은 후 ----");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();// 줄바꿈
		
		//오름차순 정렬 : 작은수부터 앞으로 오게 정렬
		//내림차순 정렬 : 큰 수부터 앞으로 오게 정렬
		// 6 3 1 8 10 2 9 7 5 4   > 랜덤 정렬된 상태
		// 첫번지 값이 크고 두번째번지 값이 작으면 서로 자리를 바꿔줘
		// 3 6 1 8 10 2 9 7 5 4  됨. 
		
		//교환의 대상은 첫번째수랑 다른번지 값이랑 비교
		// 1 6 3 8 10 2 9 7 5 4 // 1이 제일 작으니까 이제 됐다 pass
		// 1 3 6 8 10 2 9 7 5 4 
		// 1 2 6 8 10 3 9 7 5 4 // 2가 두번째로 작으니께 됐다 pass
		// 1 2 3 8 10 6 9 7 5 4 // 3이 세번째로 ㄷ작으니께 됐다. pass
		// 1 2 3 6 10 8 9 7 5 4 
		// 1 2 3 5 10 8 9 7 6 4
		// 1 2 3 4 10 8 9 7 6 5 // 4완성 pass
		// 1 2 3 4 8 10 9 7 6 5
		// 1 2 3 4 7 10 9 8 6 5
		// 1 2 3 4 6 10 9 8 7 5
		// 1 2 3 4 5 10 9 8 7 6 // 5완성 pass
		// 1 2 3 4 5 9 10 8 7 6
		// 1 2 3 4 5 8 10 9 7 6
		// 1 2 3 4 5 7 10 9 8 6
		// 1 2 3 4 5 6 10 9 8 7
		// ...
		// 1 2 3 4 5 6 7 8 9 10 끗
		
		for(int i=0; i<arr.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<arr.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(arr[i] > arr[j]) { //뒤에있는 j가 작다면 교환 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("-----오름차순 정렬----- ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("-----내림차순 정렬-----");
		for(int i=0; i<arr.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<arr.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(arr[i] < arr[j]) { //뒤에있는 j가 크다면 교환 내림차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(); // 줄바꿈
		
		System.out.println("---향상된 for문---");
		
		// 향상된 for문
		for(int tmp : arr) { // 
			// 타입이 일치해야함. tmp : arr 뜻  
			// 임시변수 tmp에  arr배열 값을 무조건 처음부터 끝까지 담아준다.
			// 건너뛰기는 금지. 안찍고싶으면 if조건으로 하면 됨.
			// 1~끝까지 순차탐색할때만 쓰면 좋다.
			System.out.print(tmp+" ");
			
		}
		
	}

}
