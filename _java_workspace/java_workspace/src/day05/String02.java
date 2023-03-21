package day05;

public class String02 {

	public static void main(String[] args) {
		// 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력.
		// 파일명 : 이것이자바다
		// 확장자 : txt
		
		// 내버전ㅋ
		String str = "이것이자바다.txt";
//		System.out.println(str.indexOf("."));
		System.out.println("파일명:"+str.substring(0,str.indexOf(".")));
		System.out.println("확장자:"+str.substring(str.indexOf(".")+1));
		
		
		//선생님 버전.
		String name = str.substring(0,str.indexOf("."));
		System.out.println("파일명 : "+ name);
		String file = str.substring(str.indexOf(".")+1);
		System.out.println("확장자 : "+file);

	}

}
