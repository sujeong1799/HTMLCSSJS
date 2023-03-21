package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
			
		// list안에 객체 만들어서 name, score 넣기
		list.add(new Student("강나이", 44));
		list.add(new Student("바카애", 64));
		list.add(new Student("융민트", 93));
		list.add(new Student("채치수채누리", 83));
		list.add(new Student("김숫자", 75));
		
		// 전체 출력
		// class에 toString 존재하면.. 
//		list.stream().forEach(System.out::println);
		
		//toString 없으면 {} : 처리구문이 많은 경우
		list.stream().forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " : " + score);
		});
		
		// 합계 구하기 -> intStream
		// getScore() => Integer => int 변환
		// 추출 => map,   int 변환 => mapToInt
		int sum = list.stream().mapToInt(n->n.getScore()).sum();
		System.out.print("합계 : " + sum+", ");
		
		// 총 인원 구하기.
		System.out.println("총 인원 : "+ list.stream().count());
		

		// 70점 이상인 친구들의 합계
		
		int sum2 = list.stream()
				.mapToInt(n -> n.getScore())
				.filter(n->n>=70)
				.sum();
		System.out.println("70점 이상 합계 : " + sum2);
		
		

	}

}
