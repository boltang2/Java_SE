package Day09.mypac2;

// Thread 객체를 만드려면
// Thread 객체 상속
public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyThread start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("MyThread end");
	}
}
