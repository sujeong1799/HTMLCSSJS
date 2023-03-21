package 리스트_메뉴판;

import java.util.Scanner;

public interface A_Program {
	void add(Scanner scan); // 메뉴추가
	void printProduct(); // 메뉴출력
	void orderPick(Scanner scan); // 주문 
	void printOrder(); //주문내역출력
	void delete(Scanner scan); // 메뉴 삭제
	void update(Scanner scan); //메뉴 수정
	
	
}
