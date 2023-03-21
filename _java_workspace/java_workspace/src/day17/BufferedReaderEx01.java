package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException{
		/* BufferedReader : 문자 보조 스트림
		 * 라인단위로 읽기가 가능
		 * 더이상 읽을 라인이 없을 경우 null을 리턴
		 * 보조스트림 : 직접 읽고쓰는기능(입출력)X
		 * 보조스트림을 사용할 경우 생성자에 기반스트림을 매개변수로 꼭 생성해야 한다.
		 * */
		
//		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		
		//다른 폴더에 있는 파일 불러올때 파일경로\\파일이름
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\EZENIC-171\\Downloads\\input.txt"));
		
		while(true) {
			String line = br.readLine(); // 읽어올때 String으로 바로 읽어옴 // 한 라인씩 읽어들임
			if(line == null) { // 내가 읽어온 라인이 null이에요 (더이상 읽을 라인이 없을경우) 
				break; // 반복문 빠져나감.
			}
			System.out.println(line);
		}
		
		br.close();
	}

}
