package day13;

import java.util.HashMap;
import java.util.Iterator; // 확인 잘해야함
import java.util.Scanner;


public class 과제 {

	public static void main(String[] args) {
		/* 단어장 
		 * 
		 * 단어:의미 => hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력하세요
		 * */

		HashMap<String, String> memo = new HashMap();
		Scanner scan = new Scanner(System.in);
//		memo.put("hello", "안녕");
//		memo.put("movie", "영화");
//		memo.put("Newjeans", "새청바지");
//		memo.put("bus", "버스");
//		memo.put("baseball", "약우");
		int size = 5;
		
		//while을 이용하여 단어와 뜻 입력받고 map에 저장
		while(memo.size() < size) {
			//입력
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("뜻 : ");
			String mean = scan.next();
			
			memo.put(word, mean); // map.size() 증가.
		}
		
		//출력
		Iterator<String> it = memo.keySet().iterator(); // 자료형 잊지말고 넣어주자.
		while(it.hasNext()) {
			String word = it.next(); // key값 반환
			String mean = memo.get(word); // Value값 반환 memo에서 직접호출
			System.out.println("단어 : "+word+" 의미 : "+mean);
		}
		
		
//		for(String tmp : memo.keySet()) {
//		System.out.println("단어 : "+tmp+", 뜻 : "+memo.get(tmp));			
//		}
		
		
	}

}
