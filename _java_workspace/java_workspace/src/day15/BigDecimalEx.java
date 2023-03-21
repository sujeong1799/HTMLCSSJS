package day15;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		
		// BigDecimal : java에서 숫자를 정밀하게 저장/표현하기 위한 클래스
		// 돈, 소수점에 대한 정밀한 계산이 필요한 경우는 필수
		// 단점 : 느린 속도
		
		
		// 값을 초기화하려면 문자열로 값을 넘겨줘야 인식을 한다. 숫자로 쓰면 안됨.
		BigDecimal db = new BigDecimal("1000.1234");
		BigDecimal db1 = new BigDecimal("100");
		BigDecimal db2 = new BigDecimal("1000.1234");
		
//		BigDecimal db3 = new BigDecimal(1000.1234); // 숫자로 넣으면 값이 이상하게 나옴.
		
		
		System.out.println(db);
		// == 객체의 주소가 같은지 비교, 값이 같은지 비교하기 위해서는 equals가 필요
		System.out.println(db.equals(db2));
		System.out.println(db.equals(db1));
		
		// compeareTo : 값을 비교시 같으면 0 작으면 -1 크면 1
		
		
		// + - * / 안됨  / add, subtrack, multiply, divide, remainder로 해야함.   
		System.out.println("\n+ "+db.add(db1));
		System.out.println("- "+db.subtract(db1));
		System.out.println("* "+db.multiply(db1));
		System.out.println("/ "+db.divide(db1));
		System.out.println("% "+db.remainder(db1));
		
		//max min
		System.out.println("\nmax : "+ db.max(db1));
		System.out.println("min : "+ db.min(db1));
		
		//BigInteger
		BigInteger bi = BigInteger.valueOf(100000); // 일반 int를 좀 더 정밀하게 써야할때 ? ? ? ? 
		System.out.println(bi);
		
		int int_bi = bi.intValue(); // Integer -> int 형태로 형변환
		long long_bi = bi.longValue(); // Integer -> long 형태로 형변환
		String string_bi = bi.toString(); // Integer -> string 형태로 형변환
		
		
	}

}
