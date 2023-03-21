package day17;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx01 {

	public static void main(String[] args) throws IOException {
		/* PrintWriter : 개체의 형식화된 표현을 텍스트 출력 스트림으로 출력한다.
		 * */
		//println, print, printf
		
		PrintWriter pw = new PrintWriter(System.out);
		
		String str = "Hello";
		
		pw.print(str);
		pw.println(); // 줄바꿈
		pw.println(str);
		pw.printf("%.2f\r\n", Math.PI); // Math.PI는 Math클래스에서 제공하는 원주율
		pw.printf("%d", (int)(Math.random()*3)+1);

		pw.flush(); // 잔류 바이트, 버퍼를 비움 
		pw.close(); // 안닫으면 출력 안됨 // flush + close 같이 닫혀 있는경우가 많음
		
		PrintWriter pw1 = new PrintWriter("test2.txt");
		for(int i=0; i<10; i++) {
			String data = i+"Test2 입니다.";
			pw1.println(data);		
		}
		pw1.close();
		
		// 추가모드로 파일에 데이터 추가
		// PrintWriter는 추가모드가 없음. 파일 객체로 생성해서 추가
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("test2.txt", true));
		
		for(int i=11; i<=20; i++) {
			String data = i + "Test2 추가 입니다.";
			pw2.println(data);
		}
		
		pw2.append('+');
		pw2.append("Hello");
		
		pw2.close();
		
		
		
		
	}

}
