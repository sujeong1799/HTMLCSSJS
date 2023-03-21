package day12;

public class PasswordException extends IllegalArgumentException {
	//에러가 안나는 이유 IllegalArgument가 RuntimeException의 종류라서.
	//IllegalArgumentException 잘못된 값을 받아주는 예외기능
	
	
	public PasswordException(String message) {//메세
		super(message);
		
	}
	
}
