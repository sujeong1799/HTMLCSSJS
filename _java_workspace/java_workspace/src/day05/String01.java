package day05;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; // 일반 자료형처럼 이용가능.
		 * */
		
		String str = "Hello world~!!"; // 배열 요소마다 각각 저장됨.
		System.out.println(str);
		
		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("----char At----");
		System.out.println(str.charAt(1));
		
		//length : 전체 글자의 길이
		System.out.println("----length----");
		System.out.println(str.length()); // 글자 전체 길이가 나옴
		
		//compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("----compareTo----");
		System.out.println("b".compareTo("a")); //b랑 a를 비교하겠습니다. b.가 비교대상
		// 사전순서상 b가 a보다 뒤임 
		
		System.out.println("a".compareTo("c"));
		System.out.println("b".compareTo("b"));
		
		//concat(str) : 이어붙이기(+ 연산자와 같은 의미) 연결의 의미
		System.out.println("----concat----");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");// 이거랑 같은 의미
		
		//equals : 두 문자열이 같은지 확인 (대소문자 구분)
		System.out.println("----equals----");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("ABC")); // 대문자는 false로 나옴
		System.out.println("abc"=="abc"); // 얘는 안되는 경우가 많아서 잘 안씀
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능, 처음부터 찾음.
		//lastindexOf(str) : 끝에서부터 찾음.
		System.out.println("----indexOf----");
		System.out.println("abc".indexOf("a"));
		System.out.println("abc".indexOf("d")); // 찾는 문자가 없으면 -1반환
		
		String email = "jjung0026@gmail.co.kr";
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf(".")); // 제일 처음 발견한 .의 위치를 넣어줌
		System.out.println(email.lastIndexOf(".")); // 끝에서부터 찾으라는 의미.
		
		//substring : 문자열 추출
		System.out.println("----substring----");
		System.out.println(email.substring(1)); // 1번째 위치부터 쭉 나옴
		System.out.println(email.substring(5)); // n번째 위치부터 출력
		System.out.println(email.substring(0,5)); // 0~4번지까지 나옴, 마지막 끝번지를 포함하지 않음 .index-1
		System.out.println(email.substring(0,9)); // 아이디만 추출, 0,9 > @의 위치를 찾아서 써주면 된다.
		System.out.println(email.substring(email.indexOf("@")));
//		골뱅이 빼구...?
		System.out.println(email.substring(email.indexOf("@")+1)); // +1을 넣으면 그 다음부터 출력하라는 말
		
		//trim : 불필요한 공백 삭제
		System.out.println("-----trim-----");
		System.out.println("          hello ~ !         ".trim());
		// 필요없는 공백이 지워져서 출력된다. 글자 사이의 공백은 안없어짐
		
		//replace : 글자 치환 (원하는 글자를 찾아서 바꿔줌)
		System.out.println("----replace----");
		System.out.println("Hello World".replace("W", "w"));
		// String, char 모두 가능
		
		System.out.println("Hello World".replace("World", "JAVA"));
	
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("----split----");
		String str2 = "dog,cat,tiger";
		//쉼표를 기준으로 나누고싶어 // 나누면 3개의 배열저장공간이 필요해서 배열 만들어줌
		String[] arr = str2.split(",");
		for(String tmp : arr) {
			System.out.println(tmp+" ");
		}
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum); // 문자여서 문자 더하기 문자하믄 나열되서 나옴.
		
		//parseInt : 문자를 숫자로 변환
		System.out.println("----parseInt----");
		
		int num3 = Integer.parseInt(num1); // Integer 정수클래스를 parseInt로 변경해,,,?
		System.out.println(num3); // 숫자 1임
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		
		int sum1 = num3+num4;
		System.out.println(sum1);
		
		//contains(str) : 해당 글자가 포함되어있는지 체크 // 포함은 true, 불포함 false
		String str4 = "이것이자바다.txt";
		System.out.println(str4.contains("자바")); 

		
	}

}
