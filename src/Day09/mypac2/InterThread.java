package Day09.mypac2;


public class InterThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Interthread start");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("InterThread end");
	}
}
