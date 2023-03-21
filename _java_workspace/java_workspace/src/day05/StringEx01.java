package day05;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들을 출력하도록 코드를 작성
		 * 
		 * 클럽에 제출
		 * */
		
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg", "String 메서드.txt",
		"String 함수.jpg", "java의 정석 표시.jpg"};
		
//		ex) java 라고 검색하면 > java의정석.txt, 이것이 java다.jpg, java의 정석 표시.jpg 출력
		
		String input; // 입력받아서 넣을거야
		int count=0;
		// 스캐너 열기
		Scanner scan = new Scanner(System.in); 
		System.out.print("검색 단어를 입력해주세요.");
		
		// 입력받기
		input = scan.next();
		
		// 배열 탐색
		//내가한것.
		for(int i=0; i<fileName.length; i++) {
			if (fileName[i].contains(input)) {
				System.out.println(fileName[i]);
				count++; // 검색값이 없을 때 구하능 방법.
			}
		
		}
		
		if(count == 0) { // 검색값이 없을 때 구하능 방법.
			System.out.println("검색값이 없습니다.");
		}
		
		
		
		//선생님이 하신 것...
//		for(String tmp : fileName) {
//			if(tmp.contains(input))
//				System.out.println(tmp);
//		}
		
		
		


}
}
