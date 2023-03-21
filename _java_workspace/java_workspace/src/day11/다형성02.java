package day11;

public class 다형성02 {

	/* 객체지향프로그램의 4가지 특성
	 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임. 
	 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리 (리턴, 매개변수,,)
	 * 
	 * 1. 추상화 (Abstraction) - 핵심적인 코드만 보여주기, 인터페이스와 구현을 분리, 불필요한 부분은 숨긴다. 
	 * 
	 * 2. 캡슐화(encapsulation)  - 정보은닉해서 데이터 보호함, 멤버변수(필드)와 메서드를 하나로 묶는 것
	 * 							 멤버변수(필드)는 숨기고 메서드로 접근
	 * 	  은닉화 : 객체의 내부의 정보는 숨겨 외부로 드러나지 않아 외부에서 데이터를 직접 접근하는 것을 방지
	 * 
	 * 3. 상속(inheritance) - 코드 재사용(확장), 클래스를 상속받아 수정하여 사용하게 되면 중복 코드를 줄일 수 있다.
	 * 
	 * 4. 다형성 (polymorphism) - 객체 변경이 용이하다.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		/* 다형성(polymorphism) : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		 * 같은 코드에서 여러가지의 다른 생행결과를 얻을 수 있음
		 * 다형성을 잘 활용하면 유연하고, 정확성있는, 유지보수가 편리한 프로그램을 만들 수 있음.
		 * */
		
		
		Animal1 hAnimal = new Human();
		Animal1 tAnimal = new Panda();
		Animal1 eAnimal = new Eagle();

		다형성02 test = new 다형성02();
		test.moveAnimal(eAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(hAnimal);
		 
		
		//read를 호출하고 싶어요 (다운캐스팅해야함)
		// 객체명  instanceof 클래스명  // 이 객체가 클래스안에 있어서 형변환이 가능해? 가능하면 true 안된다면 false
		if(hAnimal instanceof Human) { //형변환이 가능하다면 true 
			Human human = (Human)hAnimal;
			human.read();
		}
		
//		if(eAnimal instanceof Eagle) {
//			Eagle eagle = (Eagle)eAnimal;
//			
//		}
		Animal1[] AnimalList = new Animal1[3];
		
		int cnt =0;
		AnimalList[cnt] = hAnimal;
		cnt++;
		AnimalList[cnt] = tAnimal;
		cnt++;
		AnimalList[cnt] = eAnimal;
		cnt++;
		
		System.out.println("-----DownCasting-----");
		downCasting(AnimalList);
		
		
	}
	
	//메서드 생성 
	// 다형성으로 출력이 가능한 기능
	public void moveAnimal(Animal1 animal) {
		animal.move();
	}
	
	//다운캐스팅 메서드 생성
	// 리턴 = void, 매개변수(AnimalList[] animal)
	public static void downCasting(Animal1[] AnimalList) {
		for(int i=0; i<AnimalList.length; i++) {
			if(AnimalList[i] instanceof Human) { // 형변환이 가능하면 true 
				Human human = (Human)AnimalList[i]; // Human human객체생성해서 AnimalList[i]를 넣어줘
				human.read(); // 호출
			} else if(AnimalList[i] instanceof Panda) {
				Panda panda = (Panda)AnimalList[i];
				panda.love();
			} else if(AnimalList[i] instanceof Eagle){
				Eagle eagle = (Eagle)AnimalList[i];
				eagle.flying();
			} else {
				System.out.println("casting error");
			}
		}	
	}

}

class Animal1{
	
	// 얘를 상속받는 클래스를 만들어볼게요
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
	
}

class Human extends Animal1{
	
	public void move() {
		System.out.println("사람은 터벅 터벅 걸어요.");
	}
	
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}
}

class Panda extends Animal1{
	public void move() {
		System.out.println("팬더가 어슬렁 거립니다.");
	}

	public void love() {
		System.out.println("팬더는 대나무를 사랑해유.");
	}
}

class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘을 날아요.");
	}
}