package day18;

public class ThreadEx01 {

	public static void main(String[] args) {
		/* Thread(쓰레드)
		 * - 실행중인 프로그램이 OS로부터 메모리를 할당 받아(메모리에 들어간다) process상태가 됨
		 * - 하나의 프로세스는 하나 이상의 Thread를 가지게 되고,
		 *   실제 작업을 수행하는 단위는 thread 단위임.
		 * - thread 단위는 실제 CPU가 처리하는 단위
		 * - multi-thread는 여러 thread가 동시에 수행되는 프로그래밍
		 * - CPU는 시간을 잘게 쪼개서 thread들을 수행하면 사용자들은 동시에 처리되는 듯한 효과
		 * - thread는 각각 자신만의 작업 공간을 가짐(context)
		 * - 각 thread 사이에 공유하는 자원이 있을 수 있음.(자바에서는 static instance)
		 * - 여러 thread가 공유하는 자원중 경쟁이 발생하는 부분을 critical section(임계영역)
		 * - critical section에 대한 동기화(순차적 수행)를 구현하여 오류를 막음
		 * 
		 * thread를 구현 방식 - 상속(Thread), 구현(Runnable)하는 방식 2가지
		 * */
		
		// 하나의 클래스에 두개의 쓰레드 ㅋ 
		System.out.println(Thread.currentThread()); // 현재 실행중인 쓰레드
		
		MyThread th = new MyThread();
		th.start(); // run이 호출됨
		
		MyThread th2 = new MyThread();
		th2.start();
				
		// 순서없이 출력됨

	}

}

// Thread 클래스 상속 방식
class MyThread extends Thread{
	// Thread를 상속받으면 반드시 run() 메서드를 구현해야 한다.
	
	public void run() { // run이 없으면 실행을 안한다. // run은 Thread를 불렀을때 하는 일.
	
		for(int i=0; i<200; i++) {
			System.out.println(i + "번째 "+getName());
		}
	}
	
}




