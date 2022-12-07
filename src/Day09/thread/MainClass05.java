package Day09.thread;

import Day09.mypac2.InterThread;

/*
 * Thread 상속대신 Runnable 인터페이스 상속으로 Thread 객체 생성
 */
public class MainClass05 {
	public static void main(String[] args) {
		
		// Runnable 인터페이스를 구현한 객체 생성
		Runnable iThread = new InterThread();
		// 생성한 객체를 Thread 객체를 생성하여 인자로 전달
 		Thread thread = new Thread(iThread);
		//  Thread 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다.
		thread.start();
		
		System.out.println("Main end");
	}
}
