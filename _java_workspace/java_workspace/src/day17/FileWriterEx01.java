package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		/* 문자 기반 스트림
		 * */
		
		FileWriter fw = new FileWriter("test.txt"); // 기록할 파일명 넣기
		
		for(int i = 1; i<=10; i++) {
			String data = i + "바버 \r\n"; // \r\n : 데이터를 쓰고 다음줄 젤 앞쪽으로 넘어가야할때 쓴다.
			fw.write(data);
		}
		
		fw.close();
		
		// 파일을 추가모드로 열어라. ( 11~20까지 만들고싶어.) ("파일명", true) 로 쓰면 추가모드로 열겠다
		FileWriter fw1 = new FileWriter("test.txt", true); // ,찍고 옵션을 줄 수 있음.
		
		for(int i =11; i<=20; i++) {
			String data = i + "추가했다. \r\n";
			fw1.write(data);
		}
		
		 fw1.close();
		
	}

}
