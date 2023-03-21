package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import 단어장.Word;

public class WordManager {
		/* package day15에서 생성한 Word 클래스 객체화해서 사용
		 * 단어장 프로그램 작성
		 * 1. 단어등록
		 * 2. 단어리스트
		 * 3. 단어검색
		 * 4. 단어수정
		 * 5. 단어삭제
		 * 6. 파일로 출력
		 * 7. 종료
		 * */
	private ArrayList<Word> list = new ArrayList<>();
	
	//메뉴 출력
	public void printMenu() {
		System.out.println("--단어장 프로그램--");
		System.out.println("1.단어등록");
		System.out.println("2.단어리스트");
		System.out.println("3.단어검색");
		System.out.println("4.단어수정");
		System.out.println("5.단어삭제");
		System.out.println("6.파일로출력");
		System.out.println("7.종료");
	}

	//기본 단어 등록
	public void addWord() {
		list.add(new Word("Hello", "안녕"));
		list.add(new Word("hi", "안녕"));
		list.add(new Word("apple", "사과"));
		list.add(new Word("orange", "오렌지"));
		list.add(new Word("banana", "바나나"));
		list.add(new Word("dog", "강아지"));
	}
	
	//단어 등록
	public void insertWord(Scanner scan) {
		System.out.print("단어 입력 : ");
		String word = scan.next();
		
		System.out.print("의미 입력 : ");
		String mean = scan.next();
		
		list.add(new Word(word, mean));
		
//		// 생성자가 없을때 원하는 부분만 set해서 넣어도 됨 
//		Word w = new Word();
//		w.setWord(word);
//		w.setMean(mean);
//		list.add(w)
	}
	//단어리스트
	public void printWord() {
		System.out.println("=== 단어장 ===");
		
		list.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareTo(o2.getWord());
			}
			
		});
		
		for(Word w : list) {
			System.out.println(w); //toString 출력
		}
		
	}
	
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.print("검색단어입력 : ");
		String word = scan.next();
		
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.print("검색결과 > ");
				System.out.println(w);
				return;
			}
		}
		
		System.out.println("검색 단어가 없습니다.");
	}
	
	//단어수정
	public void modifyWord(Scanner scan) {
		System.out.print("검색단어입력 : ");
		String word = scan.next();
		
		System.out.print("단어 입력 : ");
		String newWord = scan.next();
		System.out.println("의미 입력 ");
		String mean = scan.next();
		
		Word w = new Word(newWord, mean);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.set(i, w); //수정
				return;
			}
					
		}
		
		System.out.println("검색 단어가 없습니다.");
		
	}
	
	//단어삭제
	public void deleteWord(Scanner scan) {
		System.out.print("삭제단어 입력 : ");
		String word = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				return;
			}
		}
		System.out.println("검색단어가 없습니다.");
		
	}
	
	//파일로 출력
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs); // 성능향상 //모았다가 보내준다. 그래서 성능향상.
		
		//단어장의 list 값을 String화 하기 위해 StringBuffer
		//객체생성
		StringBuffer sb = new StringBuffer(); 
		String data = null;
		sb.append("단어장");
		sb.append("\r\n"); // 줄바꿈

		int cnt = 0; 
		
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈
			cnt++;
		}
		
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();		
		fs.close();
	}
}
