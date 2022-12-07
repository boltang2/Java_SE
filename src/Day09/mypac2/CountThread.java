package Day09.mypac2;

import java.util.Iterator;

public class CountThread extends Thread {
	@Override
	public void run() { // 메인메소드와 비슷한 역할
		// TODO Auto-generated method stub
		System.out.println("Count start");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Count end");
	}
}
