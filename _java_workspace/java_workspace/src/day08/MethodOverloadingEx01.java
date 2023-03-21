package day08;

public class MethodOverloadingEx01 {

	public static void main(String[] args) {
		/* calc 메서드를 만들거야
		 * calc(1,2,"+") 넣었을때도 연산이 되어야하고
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자를 입력받아 연산자의 위치에 상관없이
		 * 연산의 결과가 출력되는 calc 메서드를 완성
		 * 잘못된 연산자가 들어오면 "잘못된 연산자입니다." 출력
		 * */
		
		calc(1, 2, "+");
		calc(1, "*", 2);
		calc("-", 2, 1);
		calc("$", 2, 1);
	}
	
	

	
	public static void calc(int num1, int num2, String str) { 
		int sum=0;
		if(str=="+"){
			System.out.println(sum = num1 + num2);
		}else if(str=="-"){
			System.out.println(sum = num1 - num2);
		}else if(str=="*") {
			System.out.println(sum = num1 * num2);
		}else if(str=="/") {
			System.out.println(sum = num1 / num2);
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
		
	}
	
	
	public static void calc(int num1, String str, int num2) {
		int sum=0;
		if(str=="+"){
			System.out.println(sum = num1 + num2);
		}else if(str=="-"){
			System.out.println(sum = num1 - num2);
		}else if(str=="*") {
			System.out.println(sum = num1 * num2);
		}else if(str=="/") {
			System.out.println(sum = num1 / num2);
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
	}
	
	public static void calc(String str, int num1, int num2) {
		int sum=0;
		if(str=="+"){
			System.out.println(sum = num1 + num2);
		}else if(str=="-"){
			System.out.println(sum = num1 - num2);
		}else if(str=="*") {
			System.out.println(sum = num1 * num2);
		}else if(str=="/") {
			System.out.println(sum = num1 / num2);
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
	}
	
	
	

}
