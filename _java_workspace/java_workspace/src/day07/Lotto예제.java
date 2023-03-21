package day07;

import java.util.Random;

public class Lotto예제 {

	public static void main(String[] args) {
		/* 로또번호를 생성 (1~45까지 랜덤으로 번호를 생성 (당첨번호))
		 * 로또번호 = 사용자 번호 6자리 (1~45) 배열 - 6자리 : 자동번호로 나오게
		 * 당첨번호 = 당첨번호 7자리 필요함 기본 6자리 + 1자리(보너스번호) (1~45) 배열 - 7자리
		 * 마지막에 생성된 번호가 보너스 번호라고 출력하면 됨 
		 * 
		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜서 
		 * 로또의 등수를 확인(1~10까지 해보고 잘 나오면 1~45로 변경)
		 *  
		 * */
//				실제 배열은 메인에서 생성
		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자번호
		
		randomArr(user);
		randomArr(lotto);
		
		System.out.println("user 번호");
		PrintArr(user);
		
		System.out.println();
		System.out.println();

		System.out.println("당첨 번호");
		PrintArr(lotto);
		
		System.out.println();
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝입니다 또 사세요");
		}else {
			System.out.println(rank + "등 당첨");
		}
	}
//	1. 
	/* 기능 : 번호 랜덤으로 생성하는 메서드 (1~45범위의 랜덤번호 생성후 리턴! 번호만!) 1개
	 * 매개변수 : 
	 * 리턴타입 :  
	 * 메서드명 : random
	 * */
	public static int random() {
		return (int)(Math.random()*9)+1;
		
		}
	
	//2.
	/* 기능 : 랜덤을 배열에 담아주는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : randomArr 
	 * */
	public static void randomArr(int[] arr) {
		for(int i=0; i<arr.length; i++) { // 2.  다시 여기서 arr[1]이됨
		int r= random();
		if(!isContain(arr, r)) { // arr에 같은 값이 없으면
			arr[i] = r;  // r값을 arr[i]에 넣어라

		}else{ // 1. 같은 값이 있으면 arr[1]이었으면 arr[0]으로 갔다가 
			i--;
			}
		}
	}
	
	
	
	//3
	/* 기능 :  정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : PrintArr
	 * */
	public static void PrintArr(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	//4
	/* 기능 :  중복코드 확인 같은값이 들어가지 않게 체크 (있으면 true, 없으면 false)
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 * */
	public static boolean isContain(int arr[], int random) { // 
		
		for(int tmp : arr) {
			if (tmp == random) { 
				return true;
			}
		}
		return false; 
	
	}
	
	
	//5.
	/* 기능 :  등수 체크하는 기능
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 * 
	 * --당첨기준
	 * 6개 일치 : 1등
	 * 5개일치 + 보너스일치 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 : 꽝 
	 * */
		public static int lottoRank(int[] lotto, int[] user) { 
			
			if(lotto.length <= user.length) {
				return -1; // 꽝 (하나도 맞는게 없는거래
			}
		
			int cnt = 0; // count횟수 초기화 
			
			for(int i=0; i<user.length; i++) { // 유저 번호를 싹 돌거야
				if(isContain(user, lotto[i])) { // 유저 번호랑 로또 번호랑 맞아.?
					cnt++; // 웅 맞으면 count +1
					}
			}
			
			switch(cnt) { // 모인 count로 등수 만들거야
			case 6: // 다 맞았다 1등
				return 1; 
			case 5: // 5개 맞았는데 ..? 데? 데? ㅔㄷ? 데? 데? 데?
				if(isContain(user, lotto[lotto.length-1])) { // 5개 맞고 보너스 맞으면 2등	
				return 2;  
			}else {
				return 3; // 5개만 맞으면 3등 
			}
				 
			case 4: 
				return 4;
			case 3: 
				return 5;
			default: return -1;

			}
			
		}
		
	}

