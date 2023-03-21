package 리스트_수강관리프로그램;

import java.util.Scanner;

public interface A_StudentProgram {
	
	void printStudent(); // 학생 전체 리스트
	void insertStudent(Scanner scan); // 스캐너로 입력받기.
	void searchStudent(Scanner scan); 
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
}
