package day10;

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의하는 것.
		 * - 부모클래스의 메서드와 선언부가 일치해야 한다. (매개변수나 리턴타입..?)
		 * - 접근제한자는 같거나 더 넓은 범위의 접근제한자를 써야 한다. -> 범위를 축소할 수는 없다.
		 * 
		 * 
		 * 
		 * */
		
		
		Dog d = new Dog();
		d.info();
		d.setName("뽀삐");
		d.info();
		d.howl();
		
		Cat c = new Cat("냥","고양이과"); // 기본생성자 없음.
		c.setName("야옹이");
		c.info();
		c.howl();
		
		Tiger t = new Tiger("호랭이","고양이과");
		t.info();
		t.howl();
		
		
	}

}

class Animal {
	private String name; // 이름
	private String category; // 종
	
	public void info() {
		System.out.println("-----------------------");
		System.out.println("이름:"+name);
		System.out.println("분류 :"+category);
	}

	// 생성자
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	
	// 울음소리 출력 메서드
	public void howl() {
		System.out.println("=="+name+"울음소리==");
	}


	// getter/setter
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}


class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("으르ㅡㅇ르으릉르을으릉 멍멍ㅋ");
	}
	
}

class Cat extends Animal{
	
	public Cat(String name, String category) {
		//나한테 직접적으로 접근가능한 name이 없음. 왜? name이 private라서 
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("캬옹");
	}
	
	
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		
		//슈퍼클래스의 생성자 호출
		super(name, category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("어z흥z");
	}
	
	
}





