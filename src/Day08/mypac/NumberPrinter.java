package Day08.mypac;

public class NumberPrinter {

	public void printNumber() throws InterruptedException { // 여기서 예외처리를 하지않고 printNumber를 호출한 곳에서 예외처리를 해라.
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
