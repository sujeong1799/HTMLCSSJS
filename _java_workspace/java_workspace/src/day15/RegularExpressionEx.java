package day15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {

	public static void main(String[] args) {
		// RegularExpression : 정규표현식
		// 문자의 형식을 검증하는 형태
		// 전화번호, 비밀번호, 
		// [abc]라고 적어주믄 a, b, c 셋 중 하나가 들어가야한대..
		// [a-zA-z] : 대소문자 1개 가능
		// \d: 숫자  
		// \w:[a-zA-Z0-9] : 대소문자, 숫자 1개만 가능
		// . : 모든 문자중 한개의 문자
		// ? : 없음 또는 1개
		// * : 없음 또는 1개 이상
		// {n} : 숫자의 갯수 제한을 나타내줌.
		// {n,} : 무조건 n개 이상 n보다 작으면 안됨.
		// ( ) : 그룹으로 묶어줄때?
		
		// (02|010)-\d{3,4}-\d{4} : 02 or 010만 가능 - 3자리 or 4자리만 가능 - 4자리만 가능
		
		
		// 배열 중 b로 시작하는 단어만 찾기
		String[] strArr = {"bat", "baby", "car", "cd", "date", 
				"dist", "count", "apple", "banana"};
		
		Arrays.sort(strArr); // 배열 정렬
		
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
		
		System.out.println("--------------------------");
		
		//첫 글자는 무조건 b 그 뒤에 오는 글자는 대소문자 구분x, 갯수는 없어도 되고 여러개 있어도 됨.
		Pattern pattern = Pattern.compile("b[a-zA-Z]*"); // 패턴 정해
		for(String tmp : strArr) { // 값이 하나면 for문 안씀
			Matcher matcher =pattern.matcher(tmp); 
			if(matcher.matches()) { // 패턴과 tmp가 일치하면 true반환
				System.out.print(tmp + " "); // true면 찍어줘
			}
			
		}
			
	}

}
