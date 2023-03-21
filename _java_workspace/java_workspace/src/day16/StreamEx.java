package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		/* 문자열을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 * */
		
		ArrayList<String> namelist = new ArrayList<>();
		
		namelist.add("봉구");
		namelist.add("예준");
		namelist.add("하민");
		namelist.add("은호");
		namelist.add("세게체고민트");
		namelist.add("소앙ㄱ마누리");
		namelist.add("동쟁이강ㄴ나이");
		
		namelist.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("글자수가 5글자 이상인 이름만 출력");
		//글자수가 5글자(length) 이상인 이름만 출력
		namelist.stream().filter(b -> b.length()>5).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("각 이름의 글자수 출력");
		//각자 이름의 글자수 출력
		namelist.stream().map(n->n.length()).forEach(System.out::println);
		
		
		
//		ArrayList<Integer> b = new ArrayList<>();
//		
//		b.add(1);
//		b.add(2);
//		
//		b.forEach(System.out::println);
		

		

		
	}
}
