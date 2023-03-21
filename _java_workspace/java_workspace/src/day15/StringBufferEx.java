package day15;

public class StringBufferEx {

	public static void main(String[] args) {
		// String 객체 : 문자열을 표현
		// StringBuffer : 문자열을 추가하거나, 변경할때 주로 사용하는 객체
		// append : 문자열 추가
		// insert : 특정 위치에 추가 
		// substring : 문자열 추출
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		String result = sb.toString();
		System.out.println(result);
		
		sb.insert(5, " hi");
		
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(6));
		System.out.println(sb.substring(6, 8));
		
		
		String str = "";
		str+= "hello";
		str+= " ";
		str+= "java";
		
		System.out.println(str);
		
		// Buffer보다 성능이 더 좋음.
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("java");
		
		System.out.println(sb1.toString());
		
		
	}	

}
