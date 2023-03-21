package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;

public class CustomerMain{

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer("이순신", 35));
		list.add(new Customer("김사임당", 40));
		list.add(new Customer("이아들", 10));
		
		list.stream().forEach(s ->{
			
			String name = s.getName();
			int age = s.getAge();
			int cost = s.getCost();
			System.out.println("이름 : "+name+", 나이 : " + age +", 비용 : "+ cost);
			
		});
		
		// 총 인원
		System.out.println("총 인원 : "+list.stream().count());
		
		// 총 여행비용
		int sum = list.stream().mapToInt(s -> s.getCost()).sum();
		System.out.println("총 여행비용 : " +sum);
		
		System.out.println();
		System.out.println("20세 이상 성인 리스트");
		//20세 이상 성인만 이름을 정렬하여 출력
		list.stream().filter(a -> a.getAge()>20).map(s->s.getName()).sorted().forEach(s ->{
			System.out.println("이름 : "+ s);
		});		
		
		list.stream().filter(a -> a.getAge() > 20).sorted().forEach(System.out::println);
	
	}



	
}
