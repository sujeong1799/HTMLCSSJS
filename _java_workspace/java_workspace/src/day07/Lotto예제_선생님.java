package day07;

public class Lotto예제_선생님 {

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
		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자번호
		
		randomArr(user);
		randomArr(lotto);
		
		System.out.println("당신의 ★행★운★번 호");
		PrintArr(user);
		
		System.out.println();
		System.out.println("당 첨 번 호");
		PrintArr(lotto);
		
		System.out.println();
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝");
		}else {
			System.out.println(rank + "등 당첨");
		}
//				실제 배열은 메인에서 생성

	}
//	1. 
	/* 기능 : 번호 랜덤으로 생성하는 메서드 (랜덤번호 1개만 생성 후 리턴)
	 * 매개변수 : X
	 * 리턴타입 : 랜덤번호 -> int 
	 * 메서드명 : random
	 * */
	
	public static int random() {
		return (int)(Math.random()*45)+1; // 굳이 num을 안써도 된다.
		
		}
	
	//2.
	/* 기능 : 랜덤을 배열에 저장해주는 메서드 (배열을 랜덤번호로 완성)
	 * 매개변수 : 배열 - > int[] arr (로또 또는 user) 
	 * 리턴타입 : void
	 * 메서드명 : randomArr 
	 * */
	public static void randomArr(int[] arr) {
		//중복 상관없이 배열 채우기
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = random(); // 중복 체크 안했을때는 여기서 끝.
			
			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면채우기 
 
		
		//for문사용
//		for(int i=0; i<arr.length; i++) {
//			int r= random();
//			if(!(isContain(arr, r)));{ // true라면   
//				arr[i] = r;       // arr[i]에 r을 넣어줘.
//			}else{// 이거 안하면 중복이 발생했을때 해당하는 조건문을 못타고 패스 시킴 중복이 발생한 위치는 계속 0이 되는거임...
//				i--;
//			}
//		// 10을  생성했는데
//		// 0 0 0 0 0 0  10이 없으면 
//		// 10 0 0 0 0 0 10일 넣었음.. 11생성했는데 자리가 없어 그럼 또 넣어줘
//		// 10 11 0 0 0 0 이 상태에서 또 10이 나왔을때 0 자리에 숫자를 안넣고 다시 위로 올라가서 숫자가 0이 나옴
//		}
//	}
		
		// while문 사용
		int i=0;
		while(i<arr.length) {
			int r = random();
			if(!isContain(arr, r)){
				arr[i] = r;
				i++;
				
			}
			
		}
			
	}
	
	
	
	//3
	/* 기능 :  정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열 -> int arr[]
	 * 리턴타입 : void
	 * 메서드명 : PrintArr
	 * */
	public static void PrintArr(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
	
	//4
	/* 기능 :  중복코드 확인 같은값이 들어가지 않게 체크 (있으면 true, 없으면 false)
	 * 매개변수 : int arr[], int random
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 * */
	 // !!!!그냥 기능만 쓰는거임. 뭘 출력하거나 입력하는거 아님!!!!
	public static boolean isContain(int arr[], int random) { // 5-1.arr에 들어가는게 user든 로또든 상관없었음.
		//위에 만든 배열과, 랜덤값을 주고 중복이 있는지 확인할거야
		
		for(int tmp : arr) {
			if (tmp == random) { // 값이 있는지 확인할거야.
				return true; // 있으면 true
			}
		}
		return false; //없으면 false
		
		// 향상된 for문이 아닌 일반적으로 할 때.
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==random) {
//				return true;
//			}
//		}
//		return false;
	}
	
	
	
	
	
	//5.
	/* 기능 :  등수 체크하는 기능
	 * 매개변수 : int 등수 리턴
	 * 리턴타입 : 당첨번호, 사용자번호 -> int[] lotto, int[] user 
	 * 메서드명 : lottoRank
	 * 
	 * --당첨기준
	 * 6개 일치 : 1등
	 * 5개일치 + 보너스일치 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 : 꽝 (-1 리턴) 
	 * */
	
	public static int lottoRank(int[] lotto, int[] user) { // 5-2 얘는 무조건 앞에는7개 뒤에는 6개가 들어와야함
		// lotto배열과 user배열은 갯수가 다름. 로또 =7, 유저 =6개임
		// 배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우 에러가 난다.
		if(lotto.length <= user.length) {
			return -1; // (그냥 꽝.)
		}
		
		int cnt = 0; //당첨번호의 개수 초기화
		
		//나의 대상 : user임,  user번호에 당첨번호가 있는지 확인. 
		for(int i=0; i<user.length; i++) {
			//user : 1 2 3 4 5 6
			//lotto : 1 2 7 8 5 4    9일때. 9는 보너스 번호니까 없다고 생각하고
			// user에 1이 있는지 확인 있으면 cnt +1 없으면 패스 2 있으면 +1 없으면 패스
			// ex) 보너스번호는 5개가 맞지않는이상 필요없는 번호임.
			
			if(isContain(user, lotto[i])) { //i번지에 있는 숫자가 user안에 있는지 체크
				cnt++; //있다면 숫자 증가 (보너스번호 제외)
				
			}
			
		}
		
		// cnt의 개수가 모였으면 switch문을 이용하여 랭크 결정
		switch(cnt) {
		case 6: 
			return 1; // 1등이라면 밑에 안봐도 되니까 ..? 
		case 5:
//			if(isContain(user, lotto[lotto.length-1])) { //?		
//			return 2;
//		}else {
//			return 3;
//		}
			return isContain(user, lotto[lotto.length-1])? 2 : 3; 
		case 4: 
			return 4;
		case 3: 
			return 5;
		default: return -1;

		}
		
	}
	
}

