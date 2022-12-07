package Day09.thread;

public class MainClass06 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("anoy end");
			}
		}).start();
		
		System.out.println("Main end");
	}
}
