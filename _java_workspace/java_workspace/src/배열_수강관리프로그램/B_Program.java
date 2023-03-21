package 배열_수강관리프로그램;

import java.util.Scanner;

public interface B_Program {
	/* 기능
	1. 학생 리스트 출력
	2. 학생 등록
	3. 학생 검색
	4. 수강 신청
	5. 수강 철회(삭제)
	*/
	void printStudent(); // 학생 전체 리스트
	void insertStudent(Scanner scan); // 스캐너로 입력받기.
	void searchStudent(Scanner scan); 
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
}
