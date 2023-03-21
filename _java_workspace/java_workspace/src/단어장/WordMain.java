package 단어장;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		
		wm.add();
		
		int menu = 0;
		
		while(menu != 5) {
			System.out.println("1.단어추가 | 2.단어리스트 | 3.단어검색");
			System.out.println("4.단어수정 | 5.단어삭제 　| 6.파일로 출력 | 7.종료");
			System.out.print("입력 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				wm.addWord(scan);
				break;
			case 2:
				wm.printWordlist();
				break;
			case 3: 
				wm.searchWord(scan);
				break;
			case 4:
				wm.updateWord(scan);
				break;
			case 5:
				wm.deleteWord(scan);
				break;
			case 6:
				wm.printwriter();
				break;
			case 7:
				System.out.println("종료합니다.");
				break;
				
			
			}
			
		}

	}

}
