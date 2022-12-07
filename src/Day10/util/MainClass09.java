package Day10.util;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		int[] iNum = new int[45];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = i + 1;
		}
		
		Random ran = new Random();
		for(int i = 0; i < iNum.length; i++) {
			int changeIdex = ran.nextInt(45);
			
			int tmp = iNum[i];
			iNum[i] = iNum[changeIdex];
			iNum[changeIdex] = tmp;
		}
		
		for(int i = 0; i < 6; i ++) {
			System.out.print(iNum[i] + "/");
		}
	}
}
