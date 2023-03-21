package day17;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		/* 한글 여러글자를 읽고 출력 */
		
		System.out.println("한글로 입력해주세요.(Enter) : ");
		int i;
		
		
		// InputStreamReader // 보조스트림이라서 기반스트림(입력) 받을꺼 필요함
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// i = System.in.read() 직접접근말고 isr로 입력받기
		try {
			while((i = isr.read()) != '\n') {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
