package day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		/* out.txt파일을 읽어들여 map에 저장 후
		 * 이름 : 점수
		 * ...
		 * 총 합계 출력
		 * map.put(name, score)
		 * 입력받은값은 전부 String, 계싼을 위해서는 int 자료형으로 변환이 필요.
		 * Integer.parseInt(문자값);
		 * */
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
	
		int sum = 0;
		
		
		while(true) {
			String line = br.readLine(); // 홍길동 50
			
			if(line == null) {break;} // 마지막 라인일 경우 while문 나감
			
			// 홍길동 50  substring(startIndex(포함), endIndex(미포함))
			String name = line.substring(0, line.indexOf(" ")); // " " 띄어쓰기 기준.
			
			//endindex 적지 않으면 끝까지
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
//			int score = Integer.parseInt(line.substring(line.lastIndexOf(" ")+1));
			
			map.put(name, score);
			System.out.println(name + " : " +score );
			
			sum += score;
		}

		//향상된 for문으로 출력
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp + ":" + map.get(tmp));
//		}
		
		
		System.out.println("합계 : " +sum + ", 총 인원 : "+ map.size());
		
		

		
		


	}

}
