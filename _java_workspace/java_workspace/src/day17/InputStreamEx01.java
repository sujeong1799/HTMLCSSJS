package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// FileInputStream : 바이트 단위 기반 스트림
		byte[] b = new byte[1024];
		FileInputStream fi = new FileInputStream("out.txt");
		fi.read(b);
		
		// 문자형태로 값을 읽어와야할때 byte로 변환해서 읽어와서 문자형태로 변환시켜야함.
//		String data = new String(b);
//		System.out.println(data);
		System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력.
		
		fi.close();
	}

}
