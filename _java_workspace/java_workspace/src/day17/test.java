package day17;

import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("테스트.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+"와 \r\n";
			f.write(data);
		}
		
		f.close();
		
		FileWriter w = new FileWriter("테스트.txt",true);
		
		for(int i=11; i<=20; i++) {
			String data = i+"새로운거 \r\n";
			w.write(data);
		}
		
		w.close();
	}
	

}
