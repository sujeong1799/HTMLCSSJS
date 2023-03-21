package day02;

public class 콘솔출력 {

	public static void main(String[] args) {
		/* System.out.print(); // 줄바꿈 안됨.
		 * System.out.println(); // 줄바꿈 가능.
		 * System.out.printf(); // 줄바꿈 안됨. //여러종류의 데이터를 출력할수있음.
		 * 
		 * 서식지정자를 통해 출력할 데이터의 서식을 지정할 수 있음.
		 * %c = char 한 글자, %s = String 문자열, %d = 10진 정수값, %f = float 실수값
		 * %n = 줄바꿈
		 * 
		 * escape sequence
		 *  \' \" \n \r \t <- ',"을 출력하고 싶을때 역슬래쉬를 붙이면 됨
		 *  \r(캐리지리턴) 메모장이나 뭘 출력할때 \r을 써야함 ,, 밀어주는거래...
		 *  \t 일정한 간격으로 탭
		 *  
		 * */
		
		int num1 = 3;
		int num2 = 5;
		
		// 3 + 5 = 8
//		System.out.print(num1+num2);
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.printf("%d + %d = %d%n",num1, num2, num1+num2);
		
		
		double num3 = 78;
		double num4 = 7;
		System.out.println(num3+" / "+num4+" = "+(num3/num4));
		System.out.printf("%.0f / %.0f = %.2f%n", num3, num4, (num3/num4));
		// %.2f 은 소수점 뒤 2개만 보여줌 3번째 자리에서 반올림됨 
		
		



	}

}
