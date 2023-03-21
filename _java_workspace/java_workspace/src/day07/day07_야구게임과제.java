package day07;

import java.util.Scanner;

public class day07_야구게임과제 {

	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		
		
		int count = 0; 
		int out = 0;
		int strike = 0, ball = 0;
		
		randomArr(com);// 컴퓨터 랜덤 숫자 생성하고 배열에 넣음
		System.out.println("야구게임 시작!");
		System.out.println("컴퓨터가 숫자를 생성했습니다.");
		PrintArr(com); // 컴퓨터 랜덤 출력
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while(out != 3 && strike != 3) { // out과 스트라이크가 3번이 아니면 계속 돌아!
			strike = 0; // strike 초기화 // 초기화 안하면 4스트라이크 나옴
			ball = 0; // ball 초기화
			System.out.println("숫자를 입력해주세요");
			for(int i=0; i<user.length; i++) { // 입력 받는거 user배열안에 넣기 
				user[i] = scan.nextInt();
			}
			count++; // 한바퀴 돌면 횟수 증가.
			
			for(int i=0; i<com.length; i++) { // i = 컴
				for(int j =0; j<user.length; j++) { // j = 유저
					if(com[i] == user[j]) { // 컴과 유저 숫자가 같고.
						if (i==j) { // 자릿수까지 같으면  
							strike++; // strike++
						}else { // 숫자는 같은데 자릿수가 다르면
							ball++; // ball++
						}
					}
				}
			}
				if (strike == 0 && ball == 0) { // strike가 0 ball이 0일때 
				out++; // out++
				System.out.print(out+"아웃 ,");
				}
					
				System.out.println(strike+"스트라이크"+", "+ball+"볼");
				
	
			}// while문 종료
			if(strike==3) { // strike가 3일때 
				System.out.println("성공했습니다!"+count+"번만에 성공했습니다.");
			}else {
				System.out.println(out+"아웃 입니다! 게임 끗");
			}
		
			
		}// 메인종료.
	// 랜덤 숫자 생성
	public static int random() { 
	return (int)(Math.random()*9)+1;
	}
	
	
	// 랜덤 숫자 배열에 저장하기 (단순히 저장)
	public static void randomArr(int[] arr) {
		for(int i=0; i<arr.length; i++) { 
			int r= random();
			if(!isContain(arr, r)) { 
				arr[i] = r;  
			}else{ 
				i--;
			}
		}
	}		
	
	// 배열 출력
	public static void PrintArr(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	// 배열 중복 확인
	public static boolean isContain(int arr[], int random) { 
		
		for(int tmp : arr) {
			if (tmp == random) { 
				return true;
			}
		}
		return false; 
	
	}

}
