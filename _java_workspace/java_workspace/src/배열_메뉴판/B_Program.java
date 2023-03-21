package 배열_메뉴판;

import java.util.Scanner;

public interface B_Program {

	void addMenu(Scanner scan);  // 메뉴추가
	void printProduct(); // 메뉴출력
	void orderPick(String name, int count); // 주문 
	void printOrder(); //주문내역출력

	
}