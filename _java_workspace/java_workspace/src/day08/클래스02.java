package day08;

public class 클래스02 {
	
	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : power - On(전원이 켜졌습니다 출력) / off(전원이 꺼졌습니다)
		 *        speed - Up(한번 누를때마다 +10씩) / Down (-10씩)
		 * 멤버변수 : private,
		 * 멤버변수를 확인/수정 -> getter/setter 필요  
		 * */

		Car c1 = new Car("빨강");
		
		System.out.println(c1.getColor()); // 내가 세팅해놓은 색이 나옴.
		System.out.println(c1.getSpeed()); // 
		System.out.println(c1.isPower());
		
		System.out.println("---변경---");
		
		c1.setColor("노랑"); // 컬러 바꾸능거
		System.out.println(c1.getColor());
		
		c1.powerOn();
		c1.speedUp();
		c1.speedUp();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.powerOff();
		
		c1.speedUp();
	
		c1.powerOn();
		c1.speedUp();
		
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.speedUp();
		
		
		
		Car c2 = new Car("노랑");
		System.out.println(c2.getColor());
		System.out.println(c2.isPower());
		System.out.println(c2.getDoor());
		
		c2.speedDown();
		c2.speedDown();
		c2.speedUp();
		
		c2.getColor();
		c1.speedUp();
		
	}
	

	
}
	
class Car{

	//멤버변수 선언
	private String color; //  기본 null
	private int door; // 0
	private boolean power; // 기본  false 
	private int speed; // 기본 0 스피드 값은 여기에 저장되는거임. 
		
	
	// 생성자 : 내가 만들어주지 않으면 기본생성자가 자동 추가된다.
	// 내가 생성자를 만들믄 기본생성자는 사라짐.
	// 생성자 위치 public 클래스이름 (매개변수)
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int door) {
//		this(color); // 생성자 호출 - 얘는 생성자 많이 만들때 쓰래요..
		this.color= color;
		this.door = door;
	}
	
	//매개변수가 다르면 같은 이름 ㅇㅋ
	
	public Car(){}// 기본생성자 아무것도 없음. 
	
	//생성자가 2개면 생성자 오버로딩..
		
	
	
	//멤버 메서드
	public void powerOn() { // 내부에서 키는거지 밖에서 가져오는거 아님 가져올 변수가 없다.
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power = false;
	}
	
	
	
	public void speedUp(){ // 스피드가 올랐다고해서 이걸로 연산하는거 아니라서 리턴값 없음.
		if(power) { // 내 클래스 안에서는 멤버변수 쓸 수 있어요.
			speed = speed+10; 
			System.out.println(color+" 속도 : "+speed);
		}else {
			System.out.println("시동 먼저 켜주세요^^");
		}
		
	}
	
	public void speedDown() {
			if(speed > 0) { // 스피드가 0보다 클때만 -10해
				speed = speed - 10;
				System.out.println(color+" 속도 : "+speed);	
			} else {
				System.out.println(color+" 속도 : "+speed);
			}

			
	}

	
	//getter/setter
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) { // 바꾸기만한다 뭔가 리턴하지 않음.
		this.color = color; // this붙인건 내 매개변수
	}

	public boolean isPower() { // boolean은 get,set이 아니고 is붙고 상태를 보여주능거..?
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
	
	
	


}

	

	
	


