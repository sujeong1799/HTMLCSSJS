package 단어장;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordManager {
	private ArrayList<Word> wordlist = new ArrayList<>();
	
	public void add() {
		wordlist.add(new Word("hello", "안녕"));
		wordlist.add(new Word("bus", "버스"));
		wordlist.add(new Word("apple", "사과"));
		wordlist.add(new Word("dog", "강아지"));
		wordlist.add(new Word("cat", "고양이"));
		
	}
	
	public void printwriter() throws IOException {
		FileWriter fw = new FileWriter("Word.txt");
		
		for(Word tmp : wordlist) {
			fw.write(tmp.getWord() + " " + tmp.getMean()+"\r\n");
		}
		
		fw.close();

		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\EZENIC-171\\Desktop\\_java_workspace\\java_workspace\\Word.txt"));
		
		
		while(true) {
			String line = br.readLine(); // 읽어올때 String으로 바로 읽어옴 // 한 라인씩 읽어들임
			if(line == null) { // 내가 읽어온 라인이 null이에요 (더이상 읽을 라인이 없을경우) 
				break; // 반복문 빠져나감.
			}
			System.out.println(line);
		}
		
		br.close();
	}
	
	
		
	
	
	public void printWordlist() {
		
		wordlist.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareToIgnoreCase(o2.getWord());
			}
		});
		
//		// 정렬
//		Collections.sort(wordlist, new Comparator<Word>() {
//
//			@Override
//			public int compare(Word o1, Word o2) {
//				return o1.getWord().compareToIgnoreCase(o2.getWord());
//			}		
//		});
//		
		System.out.println("✧･ﾟ:*ﾟ 단어리스트 *:･ﾟ✧");
		
		for(int i=0; i<wordlist.size(); i++) {
			wordlist.get(i).printWord();
		}
		System.out.println("✧･ﾟ: *✧･ﾟ:* *:･ﾟ✧*:･ﾟ✧");
	}
	
	
	public void addWord(Scanner scan) {
		char ch = 0;
		
		while(ch != 'n') {
		
			System.out.println("단어를 입력하시겠습니까? y/n");
			ch = scan.next().charAt(0);
			
			if(ch=='y'|ch=='Y') {
				System.out.print("단어 : ");
				String word = scan.next();

				for(int i=0; i<wordlist.size(); i++) {
					if(wordlist.get(i).getWord().equals(word)) {
						System.out.println("추가되어있는 단어입니다.");
					}
				}
				
				System.out.print("의미 : ");
				String mean = scan.next();
				
				Word w = new Word(word, mean);
				
				wordlist.add(w);
		
			}
		}
	}
	
	
	public void searchWord(Scanner scan) {
		int index = -1;
		System.out.print("검색 단어 입력:");
		String word = scan.next();
		
		for(int i=0; i<wordlist.size(); i++) {
			if(wordlist.get(i).getWord().equals(word)) {
				index = i;
				System.out.println();
				wordlist.get(i).printWord();
			}
		}
		
		if(index == -1) {
			System.out.println("없는 단어입니다.");
		}
	}
	
	public void updateWord(Scanner scan) {
		int index = -1;
		
		
		
		System.out.print("단어 입력 : ");
		String word = scan.next();
		
		for(int i=0; i<wordlist.size(); i++) {
			if(wordlist.get(i).getWord().equals(word)) {
				index = i;
				System.out.println("　　 단어, 의미");
				wordlist.get(index).printWord();
			}
			System.out.println();
		}
		System.out.print("새로운 단어 입력 : ");
		String newWord = scan.next();
		wordlist.get(index).setWord(newWord);
		
		System.out.print("새로운 의미 입력 : ");
		String newMean = scan.next();
		wordlist.get(index).setMean(newMean);
		
		if(index == -1) {
			System.out.print("없는 단어입니다.");
		}
		
	}
	
	public void deleteWord(Scanner scan) {
		int index = -1;
		System.out.print("단어 입력 : ");
		String word = scan.next();
		
		for(int i=0; i<wordlist.size(); i++) {
			if(wordlist.get(i).getWord().equals(word)) {
				index = i;
				wordlist.remove(index);
			}
		}
		
		if(index == -1) {
			System.out.println("없는 단어입니다.");
		}
	}


	
}
