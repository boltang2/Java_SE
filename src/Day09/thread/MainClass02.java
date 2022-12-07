package Day09.thread;

import Day09.mypac2.CountThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("Main start");
		CountThread ct = new CountThread();
		
		ct.start();
		
		System.out.println("Main end");
	}
}
