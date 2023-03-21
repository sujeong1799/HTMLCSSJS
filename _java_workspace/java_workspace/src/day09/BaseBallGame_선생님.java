package day09;

import java.util.Scanner;

public class BaseBallGame_선생님 {

	public static void main(String[] args) {
		/* 야구게임 메서드로 변경
		   랜덤번호 생성
		   배열에 저장(중복메서드 < 이건 선택해서 결정)
		   출력메서드
		   스트라이크 메서드
		   볼 메서드
		   
		   while은 메인에서 돌릴거야.
		 * */
//		int comNum[]; => null // 객체생성 안하고 걍 해부리면 null
		int com[] = new int[3];
		int user[] = new int[3];
		
		//랜덤 수 범위
		int max=9, min=1; 
		
		int s=0, b=0, count=0; // strike를 s에서 받고 ball을 b에서 받는다
		
		Scanner scan = new Scanner(System.in);
		
		randomArray(com, max, min); // com랜덤수
		System.out.println("야구게임 시작");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
		
		
		while(s!=3) {
			//사용자번호 입력받기
			System.out.println("1~9까지 숫자 3개 입력>");
			for(int i=0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
			
			count++;
			
			//결과 판정 (strike,ball 둘 다 판정해야함) 각각 호출
			s = strike(com, user);
			b = ball(com, user);
			
			//System.out.println(s+"S "+b+"B");
			
			//0일때 표현하지않게 처리
			if(s!=0) {
				System.out.print(s+"S ");
			}
			
			if(b!=0) {
				System.out.println(b+"B ");
			}
			
			System.out.println("게임횟수 : "+count);
			
			if(s==0 && b==0) {
				System.out.println("OUT!!");
			}
			
		}
		System.out.println("정답! 축하합니다 게임종료");
		System.out.println("");
		
		scan.close();
		
		

	}
	
	//랜덤번호 생성 : 매개변수로 범위를 설정. 20~30 뽑고싶을때 cnt = 10, start = 20
	// 개수, 시작값 (int)(Math.random()*개수)+시작;
//	public static int random(int cnt, int start) {
//		return (int)(Math.random()*cnt)+start;
//	}
//	
	// 범위 > 20~30 max - min + 1  // 범위로 하면 작은값이 무조건 min값이라서 이렇게 처리하는게 맞나요..?
	// (int)(Math.random()*max - min + 1 )+min;
	public static int random(int max, int min) {
		if(max < min) { // max와 min의 숫자 값이 바뀌어서 들어올때 처리
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	
	//중복확인 메서드
	public static boolean isContain(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false; // for문 끝나고 진짜진짜진짜 없으면 false반환.
	}
	
	// 배열 생성 메서드 (중복제거포함) // 랜덤 설정 범위도 받아야함.
	// 왜 boolean? 배열생성이 있으면 true, 없으면 false
	// true가 리턴되면 정상적으로 배열이 생성됨을 알려주는 기능
	public static boolean randomArray(int[] arr, int max, int min) {
		// 꼭 boolean으로 안해도 됨. void로하면 while만 쓰면 됨(?)
		if(arr == null) {
			return false;
		}
		if((max-min+1) < arr.length){ // 랜덤수의 개수(max-min+1)가  배열의 length보다 작으면 false 
			return false;
		} 
		
		int i=0;
		while(i<arr.length) {
			int r = random(max, min);
			if(!isContain(arr, r)){
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	//배열 메서드 출력
	public static void PrintArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(); // 줄바꿈
	}
	
	
	//스트라이크 메서드
	//기능 : com[]과  user[]을 받아서 위치와 값이 일치하면 카운트증가시키고 반환한다.
	//메서드명: strike
	//리턴 : int count
	
	public static int strike(int[] com, int[] user) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == user[i]) { // 인덱스끼리만 비교 
				cnt++;
				
			}
		}
		return cnt;
	}
	
	
	//볼 메서드 (다른방식)
	//기능 : com[], user[] 위치 상관없이 일치하면 카운트증가시키고 반환한다.
	public static int ball(int[] com, int[] user) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(isContain(user, com[i])){ // 둘이 비교해서 있으면 // 자리 상관없이 일치하면 count 증가
				cnt++; // cnt 증가 
			}
		}
		//스트라이크의 개수만큼 차감
		return cnt - strike(com, user); // 
	}
	
	

}
