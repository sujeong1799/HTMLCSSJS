package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, PrintWriter
		 * 파일을 읽어들여 복사하여 객체생성
		 * out.txt에서 파일을 읽어서 -> out2.txt로 쓰기 
		 * */
		
		System.out.println("파일 읽는 중.");
		BufferedReader br = null;
		PrintWriter pw = null;
		
		final String Path_OUT = "out2.txt";
		
		System.out.println("복사를 시작합니다.");
		
		br = new BufferedReader(new FileReader("out.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT));
		// FileWriter로 해도 된다
		
		
		System.out.println("복사를 위한 객체 생성 완료");
		
		String line = "";
		
		//true 써서 해도 됨
		while((line = br.readLine())!=null) {
			System.out.println(line); //콘솔 출력 (안해도 상관없음)
			pw.println(line);
//			pw.write(line+"\r\n");	
		}
		
		System.out.println("텍스트 복사 완료");
		
//		br.close();
//		pw.close();
		
		if(br!=null) {
			br.close();
		}
		if(pw!=null) {
			pw.close();
		}
		

		
	}

}
