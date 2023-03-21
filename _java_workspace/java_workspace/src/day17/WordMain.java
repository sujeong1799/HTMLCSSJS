package day17;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		WordManager mw = new WordManager();
		mw.addWord();
		
		int menu = -1;
		
		do {
		mw.printMenu();	
		menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			mw.insertWord(scan);
			break;
		case 2:
			mw.printWord();
			break;
		case 3:
			mw.searchWord(scan);
			break;
		case 4:
			mw.modifyWord(scan);
			break;
		case 5:
			mw.deleteWord(scan);
			break;
		case 6:
			mw.fileWord();
			break;
		case 7:
			break;
		default:
			System.out.println("잘못된 메뉴 입니다.");
		}
			
		}while(menu != 7);
		System.out.println("프로그램 종료.");
		
		
		scan.close();

	}

}
