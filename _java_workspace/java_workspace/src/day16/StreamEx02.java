package day16;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * */
		
		int[] arr = {1,2,6,7,8,9,4,5,1,10,5,7,10,5};
		
		System.out.println("짝수, 중복제거, 정렬 출력");
		Arrays.stream(arr).distinct().sorted()
		.filter(n -> (n%2==0)).forEach(System.out::println);
		
		
		System.out.println("짝수 배열로 담기");
		//짝수 배열로 담기
		int res[] = Arrays.stream(arr).filter(n -> n%2==0).distinct().sorted().toArray();
		
		for(int tmp : res) {
			System.out.print(tmp+ " ");
		}
		
		// 학생 클래스 생성(Student)
		// -name, score만 있음
		// 생성자, getter,setter / toString필요없음
		
		// StreamEx03 클래스 생성
		// Student list맨들어서 name이랑 score 채워 5명정도 수동으로 add하면 됨
		
		// list로 스트림 생성 후 
		// 학생의 이름과 점수 출력 (이름 : 점수)
		// 점수 합계 출력
		
		

	}

}
