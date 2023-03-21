package day11;

public class 다형성01 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object클래스다.
		 * 모든 클래스는 Object가 제공하는 클래스를 사용할 수 있고,
		 * 오버라이딩도 할 수 있다.
		 * 
		 * 상속은 단일상속이 원칙!
		 * 부모는 무조건 1명, 2개가 될 수는 없다.
		 * 
		 * */
		
		A b= new B();  // A(부모)클래스를 이용해 만들 수 있음 
		b.num=10;
		System.out.println(b);
		
		A a = new A();
		a.num=20;
		System.out.println(a);
		
//		B bb = new A(); // B(자식)클래스 기반으로는 만들 수 없당.
		
	}

}

class A{
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}

}


class B extends A{

}



class C{
	int num1;
}


//class c extends A extends C{ // 이렇게 안됨.
	
//}
