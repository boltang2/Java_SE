package Day08.exception;

import Day08.mypac.NumberPrinter;

public class MainClass05 {
	public static void main(String[] args) {
		 NumberPrinter np = new NumberPrinter();
		 
		 try {
			np.printNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
