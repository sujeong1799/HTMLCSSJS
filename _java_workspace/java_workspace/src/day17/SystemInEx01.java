package day17;

import java.io.IOException;

public class SystemInEx01 {

	public static void main(String[] args) {
		/* 알파벳 하나를 쓰고 Enter를 누르면 알파벳을 콘솔에 출력
		 * */
		
		System.out.println("알파벳 여러개 쓰고 Enter : ");
		int i;
		try {
			while((i = System.in.read()) != '\n') { // 엔터칠때까지 돌아 \n // i != '\n'이라고 쓰면 에러 뜨니까 read데려와. 
//				System.out.println(i); // 그냥 찍기
				System.out.print((char)i+" "); //char형태로 형변환 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
