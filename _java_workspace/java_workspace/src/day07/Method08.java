package day07;

import java.util.Scanner;

public class Method08 {
	
	//멤버변수
	static Scanner scan = new Scanner(System.in);

	//메서드
	public static void main(String[] args) {
		/* 배열이 주어졌을때 배열을 출력하는 메서드 생성
		 * 
		 * */
		
		
		int[] arr = new int[] {5,7,8,9,4,0,1,11,13,16,12,2,10,3,14};
		
		System.out.println("5개씩 정렬");
		printArray(arr);
		System.out.println();
		
		System.out.println("오름차순해서 5개씩 정렬");
		printArray(sortArray(arr));
		System.out.println();
		
		System.out.println("오름차순해서 한 줄 정렬");
		printA(sortArray(arr));
		
		System.out.println();
	
		System.out.println("---random 배열 출력---");
		System.out.println("선생님버전");
		int arr2[] = randomArray1(15);
		sortArray(arr2); // 어떤 배열이든 정렬만하고
		printArray(arr2); // 어떤 배열이든 프린트만 한다.
		
		
		System.out.println();
		
		System.out.println("내...꺼..");
		printA(randomArray());
		
	}
	
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : printArray()
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	
	public static void printArray(int[] arr){
		int num = 0;// 숫자 더해서 5번째 줄일때 끊어주려고 만듬
		for(int i=0; i<arr.length; i++) {
			num = num+1; // +1
			System.out.print(arr[i]+" ");
			
			if(num==5) { // num이 5가되면 줄바꿈을 한다.
				num = 0;
				System.out.println();
			}
		}
	}
		
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : printArray()
	 * 옆으로 한 줄씩 출력
	 * */

	public static void printA(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : sortArray()
	 * 오름차순
	 * */

	public static int[] sortArray(int[] arr){
		
		for(int i=0; i<arr.length-1; i++) { // 마지막은 비교할 필요가 없어서 -1
			for(int j = i+1; j<arr.length; j++) { // j는 끝까지 비교 마지막 포인트까지 j가 가야함.
				if(arr[i] > arr[j]) { //arr[i]가 arr[j]보다 크믄 j가 크면 내림차순됨. 
					int tmp = arr[i]; // tmp랑 바꿔
					arr[i] = arr[j]; 
					arr[j] = tmp;
				}
			}
		}return arr;
		
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : int size
	 * 메서드명 : randomArray
	 * 리턴타입 : 배열 > int[]
	 * */
	
	public static int[] randomArray() {
		int num2;
		System.out.println("만들고 싶은 랜덤수만큼 숫자를 입력하세요.");
		num2 = scan.nextInt();
		int[] size = new int[num2];
		for(int i=0; i<size.length; i++) {
		size[i] = (int)(Math.random()*100)+1;
		}
		
		return size;		
		
	}
	
	//선생님
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는메서드
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
		