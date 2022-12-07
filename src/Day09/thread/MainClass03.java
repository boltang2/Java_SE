package Day09.thread;

import Day09.mypac2.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		CountThread ct = new CountThread();
		System.out.println("Main start");
		ct.start(); // 카운트 스레드 시작
		
		for(int i = 0; i < 10; i ++) {
			System.out.println(i * 100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main end");
	}
}
