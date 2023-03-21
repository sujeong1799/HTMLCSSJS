package day07;

import java.util.Scanner;

public class day06과제_선생님 {

	// 멤버변수의 자리 
	// static을 붙이면 스캐너 사용 가능
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 계산기 (+ - *  / %) 각 메서드를 만들기
		 * 메서드에서 바로 출력(3 + 2 = 5)
		 * 1. 숫자를 입력받는 메서드 (스캐너)
		 *  - 숫자는 배열로 입력받기 int배열로 for문 돌리거나 각자 넣어서 2개 넣으몀ㄴ 됨
		 * 
		 * 2. 메뉴 메서드 
		 *  - 원하는 계산을 선택해주세요. > 
		 *  - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 
		 * 3. main에서 처리되어야 되는 부분.
		 *  1. 입력받은 숫자(1번메서드) 호출  -> 숫자를 배열로 저장
		 *  2. 2번에서 만든 메뉴 메서드 호출 - > 내가 선택한 번호 가져오기 (리턴받아서 가져와야함)
		 *  3. switch문을 이용해서 2번 메서드 호출 값 담아서 
		 *  4. case에 따라서 계산기 메서드 호출 
		 *  
		 * */
		
		int[] nums = getNums();
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
		
		int select = getSelect();
//		System.out.println(select);
		
		switch(select) {
		case 1:
			getSumResult(nums);
			break;
		case 2:
			getsubResult(nums);
			break;
		case 3:
			getMulResult(nums);
			break;
		case 4:
			getDivResult(nums);
			break;
		case 5:
			getModResult(nums);
			break;
		default:
			System.out.println("연산 선택이 이상해요 ㅡㅡ;");
		}
		System.out.println("프로그램 종료");
	}
	
	/* 기능 : 숫자를 배열로 입력받는 메서드 
	 * 
	 * 리턴타입 : (숫자배열) int 배열 -> int[]
	 * 매개변수 : x
	 * 메서드명 : getNums()
	 * */
	
	public static int[] getNums() {
		int[] nums = new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요."); // 입력받아서 nums[i]에 넣기.
			nums[i] = scan.nextInt();
		}
		return nums;
	}
	
	
	/* 기능 : 메뉴를 나타내는 메서드 
	 * 
	 * 리턴타입 : 메뉴에서 선택한 값 -> int
	 * 매개변수 : x
	 * 메서드명 : getSelect()
	 * */
	
	public static int getSelect() {
		System.out.println("원하는 계산을 선택해주세요.");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int select = scan.nextInt();
		return select;
	}
	
	/* 기능 :  (+ - *  / %) 에 대한출력 메서드
	 * 
	 * 리턴타입 : 바로 출력할거라서 void 
	 * 매개변수 : 배열
	 * 메서드명 : getSumResult()
	 * */
	
	public static void getSumResult(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			result = result + nums[i];
		}
		System.out.println(nums[0]+"+"+nums[1]+"="+result);
	}
	
	public static void getsubResult(int[] nums) {
		int result = nums[0] - nums[1];
		System.out.println(nums[0]+"-"+nums[1]+"="+result);
	}
	
	public static void getMulResult(int[] nums) {
		System.out.println(nums[0]+"*"+nums[1]+"="+((double)nums[0]*nums[1]));
	}
	
	public static void getDivResult(int[] nums) {
		System.out.println(nums[0]+"/"+nums[1]+"="+(nums[0]/nums[1]));
	}
	
	public static void getModResult(int[] nums) {
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}
}
