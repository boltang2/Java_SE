package Day09.thread;

import Day09.mypac2.Brother;
import Day09.mypac2.Sister;
import Day09.mypac2.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// Wallet 객체 생성
		Wallet wallet = new Wallet();

		// Brother 객체 생성
		Brother brother = new Brother(wallet);

		// Sister 객체 생성
		Sister sister = new Sister(wallet);
		
		// 각각의 객체를 이요해서 두개의 스레드 시작시키기
		
		sister.start();
		brother.start();
		
		System.out.println("Main end");
	}
}
