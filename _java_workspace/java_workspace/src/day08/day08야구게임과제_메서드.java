package day08;

import java.util.Scanner;

public class day08야구게임과제_메서드 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		
		
		randomArr(com);
		System.out.println("야구게임 시작!");
		System.out.println("컴퓨터가 숫자를 생성했습니다.");
//		PrintArr(com);
		LastBall(user, com);
	
			
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
	
	public static void userinput(int[] arr) {
		System.out.println("숫자 입력 (1 ~ 9, 숫자 3개) : ");
		
		String mystr =scan.next();
		String[] myNumstrArr = mystr.split(""); 
		for(int i = 0; i<arr.length; i++) {
		arr[i] = Integer.parseInt(myNumstrArr[i]);
		}
	}
	
	
	// 숫자 비교
	public static void LastBall(int[] user, int[]com) {
		int strike=0, ball=0, out=0, count=0;
		
		
		while(out != 3 && strike != 3) { 
			strike = 0; 
			ball = 0; 
			
			userinput(user);
			
			count++; 
			for(int i=0; i<com.length; i++) { 
				for(int j =0; j<user.length; j++) { 
					if(com[i] == user[j]) { 
						if (i==j) { 
							strike++; 
						}else { 
							ball++; 
						}
					}
				}
			} // for문종료 
			
			if (strike == 0 && ball == 0) {
			out++;
			System.out.print(out+"아웃 ,");
			}
					
			System.out.println(strike+"스트라이크"+", "+ball+"볼");
				
	
		}// while문 종료
			if(strike==3) { // strike가 3일때 
				System.out.println("성공했습니다!"+count+"번만에 성공했습니다.");
			}else {
				System.out.println(out+"아웃 입니다! 게임 끝!!!!");
			}
		
	}
	

}
