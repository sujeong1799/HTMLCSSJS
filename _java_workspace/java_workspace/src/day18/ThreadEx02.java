package day18;

public class ThreadEx02 {

	public static void main(String[] args) throws Exception {
		// Runnable을 구현하는 방법
		// 바로 객체를 생성하지 못함
		
		// 1 
		MyThread2 mth = new MyThread2(); //mth형태에서 start 호출을 못 함.
		Thread th1 = new Thread(mth); // thread 객체를 생성해서 mth를 담아줘야 한다.
		th1.start();
		
		// 1번 Thread가 끝나고 2번 Thread가 시작됐으면 좋겠어
		th1.join(); //1번이 끝나기전에 2번이 시작될 수 없음.
		
		// 2 
		Thread th2 = new Thread(new MyThread2()); // Thread객체안에 MyThread2를 생성하능 방법.
		th2.start();
		
		th2.join(); // 2번 끝나기전에 main End가 나올 수 없다.
		
		System.out.println("main End!!");
	
	}

}

class MyThread2 implements Runnable{

	@Override
	public  void run() {
		// 반드시 run메서드 구현
		
		for(int i=0; i<200; i++) {
			System.out.println(i + "번째" + Thread.currentThread().getName());
		}
		
	}
	
}