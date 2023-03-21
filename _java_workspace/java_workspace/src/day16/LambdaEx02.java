package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		/* stream(스트림) "자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨. 재사용 불가. 
		 * 다른 연산을 하려면 스트림을 다시 생성해야 됨
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 최종연산 : sum(), forEach(), reduce(계산)
		 */
		 
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		// 배열을 스트림으로 만들기
		int[] arr = {1,2,3,4,5};
		long num = Arrays.stream(arr).count();
		System.out.println(num);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		// 엥 이건 모야
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		// 성적배열 a에서 70점 이상인 점수만 합계
		int[] a = {50, 33, 47, 83, 97, 78};
		int sum1 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>=70) {
				sum1 += a[i];
			}
		}
		System.out.println("java로 구현한 sum : "+sum1);
		
		int sum2 = Arrays.stream(a).filter(b->b>=70).sum();
		System.out.println("stream으로 구현한 sum : " + sum2);
		
		//리스트로 성적리스트를 생성하고, 스트림을 생성한 후 70이상인 점수만 합계 출력
		ArrayList<Integer> stream2 = new ArrayList<>();
		
		stream2.add(55);
		stream2.add(66);
		stream2.add(18);
		stream2.add(78);
		stream2.add(98);
		stream2.add(75);
		
		int listsum = stream2.stream().filter(b->b>=70).mapToInt(n->n.intValue()).sum();
		System.out.println("list로 구현한 sum : "+ listsum);
		// list는 클래스라서..? 형변환이 안된대
		// 글서 바로 sum을 못구하기때문에 데이터로 뽑을때 mapToInt로 형변환시키고
		// sum을 구해야함. 
		
		
		// 70점 이상인 애들.
		System.out.println("---70점 이상만---");
		Stream<Integer> s = stream2.stream();
		s.filter(b->b>=70).forEach(System.out::println);
		
		
		// 얘는 인트로 먼저 변환하구 filter한거임.
		Stream<Integer> s1 = stream2.stream();
		int s1sum = s1.mapToInt(n->n.intValue()).filter(b->b>=70).sum();
		System.out.println("list로 구현한 sum2 : "+s1sum);
		
		
		
		
	}

}
