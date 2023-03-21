package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary {

	public static void main(String[] args) {

		Word w = new Word();

		int menu = 0;

		Scanner scan = new Scanner(System.in);

		while (menu != 3) {
			System.out.println("1.단어추가 | 2.단어리스트 | 3.종료");
			System.out.print("메뉴 입력 : ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				w.makeWord();
				break;
			case 2:
				w.printWord();
				break;
			case 3:
				System.out.println("종료합니다. ");
				break;
			}
		}

	}
}

class Word {
	// hello : 안녕, 아침인사, 반가움, 비슷한 말 Hi . . . 여러 의미를 넣고 싶을 때
	private Map<String, ArrayList<String>> words = new HashMap<>();
	Scanner scan = new Scanner(System.in);

	/*
	 * y를 입력하면 단어를 입력, n을 입력하면 종료 단어가 이미 있다면 '이미 있는 단어입니다.' 등록 금지. 메서드명 : makeword
	 */

	public void makeWord() {
		System.out.println("단어를 입력하시겠습니까? [y/n]");
		char ch = scan.next().charAt(0);

		a: while (ch != 'n') {
			if (ch == 'y') {
				System.out.print("단어 : ");
				String word = scan.next();

				for(String tmp : words.keySet()) {
					if (words.containsKey(word)) {
						System.out.println("이미 있는 단어입니다.");
						break a;
					}
				}

				System.out.print("의미 : ");
				String mean = scan.next();
				ArrayList<String> meanlist = new ArrayList<>();
				meanlist.add(mean);

				while (true) {
					System.out.println("다른 의미도 추가하시겠습니까? [y/n]");
					ch = scan.next().charAt(0);
					if (ch == 'y') {
						System.out.print("의미 : ");
						mean = scan.next();
						meanlist.add(mean);
					} else if (ch == 'n') {
						break;
					}
					words.put(word, meanlist);
				}

			}
		}
	
	}
	
	

	/*
	 * 단어 출력 메서드
	 */
	
	public void printWord() {
		System.out.println("\n　　✧･ﾟ:*ﾟ 단어리스트 *:･ﾟ✧");
		for(String tmp : words.keySet()) {
			System.out.println("　　"+tmp + " " + words.get(tmp));
		}
		System.out.println("　　✧･ﾟ: *✧･ﾟ:* *:･ﾟ✧*:･ﾟ✧\n");

	}
	
	
	

	
}